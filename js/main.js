document.addEventListener("DOMContentLoaded", () => {
  const events = [
    { title: "Tech Innovators Meetup", category: "tech" },
    { title: "Music for All Fest", category: "music" },
    { title: "Community Sports Day", category: "sports" }
  ];

  const container = document.getElementById("eventCards");
  events.forEach(event => {
    const col = document.createElement("div");
    col.className = "col-md-4 mb-4";
    col.innerHTML = `
      <div class="card h-100 shadow">
        <div class="card-body">
          <h5 class="card-title">${event.title}</h5>
          <p class="card-text">Category: ${event.category}</p>
          <button class="btn btn-outline-primary" data-bs-toggle="modal" data-bs-target="#infoModal">Info</button>
        </div>
      </div>`;
    container.appendChild(col);
  });

  document.getElementById("registrationForm").addEventListener("submit", function (e) {
    e.preventDefault();
    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const type = document.getElementById("eventType").value;

    if (name && email && type) {
      document.getElementById("output").textContent = `Thank you, ${name}, for registering!`;
      localStorage.setItem("preferredEventType", type);
    }
  });

  const savedType = localStorage.getItem("preferredEventType");
  if (savedType) {
    document.getElementById("eventType").value = savedType;
  }
});
