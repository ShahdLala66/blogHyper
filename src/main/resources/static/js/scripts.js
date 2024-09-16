// Listen for form submission
document.getElementById('postForm').addEventListener('submit', async function(event) {
    event.preventDefault(); // Prevent default form submission behavior

    // Get the content of the post
    const postContent = document.getElementById('postContent').value;

    // Send a POST request to the backend
    const response = await fetch('http://localhost:8080/posts/create', {  // Adjust the port if necessary
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ content: postContent }), // Convert the post content to JSON
    });

    const newPost = await response.json(); // Parse the JSON response

    // Update the UI
    addPostToUI(newPost); // Call function to add new post to the UI

    // Clear the textarea for new input
    document.getElementById('postForm').reset(); // Reset the form fields
});

// Function to add post to UI
function addPostToUI(post) {
    const postElement = document.createElement('div');
    postElement.className = 'post';
    postElement.innerHTML = `<p>${post.content}</p><small>${new Date(post.createdAt).toLocaleString()}</small>`;

    const postsContainer = document.getElementById('postsContainer');
    postsContainer.prepend(postElement); // Add to the top of the list
}

// Fetch and display existing posts on load
window.addEventListener('DOMContentLoaded', async () => {
    const response = await fetch('http://localhost:8080/posts/all'); // Fetch posts from the backend
    const posts = await response.json(); // Parse the JSON response

    posts.forEach(post => addPostToUI(post)); // Display each post in the UI
});
