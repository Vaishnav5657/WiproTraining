
document.addEventListener("DOMContentLoaded", () => {
  const images = [
    "https://www.carsjade.com/wp-content/uploads/2022/11/2024-Land-Rover-Defender-Changes-1024x662.png",
    "https://assets.adac.de/image/upload/c_scale,f_auto,t_16:9-default,w_2000/v1/ADAC-eV/KOR/Bilder/PR/land-rover-defender-front-2006_wqizd1",
    "https://www.drivearabia.com/app/uploads/2020/09/2021-land-rover-defender-90-x-dynamic-1.jpg",
    
  ];

  let currentIndex = 0;
  const galleryImage = document.getElementById("galleryImage");
  const prevBtn = document.getElementById("prevBtn");
  const nextBtn = document.getElementById("nextBtn");

  // Show image at current index
  function showImage(index) {
    galleryImage.src = images[index];
  }

  // Next image
  nextBtn.addEventListener("click", () => {
    currentIndex = (currentIndex + 1) % images.length;
    showImage(currentIndex);
  });

  // Previous image
  prevBtn.addEventListener("click", () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
  });

  // Initialize
  showImage(currentIndex);
});