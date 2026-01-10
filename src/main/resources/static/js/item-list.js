const btn = document.getElementById("itemAdd");
const closeBtn = document.getElementById("closeModalBtn");
const overlay = document.getElementById("modalOverlay");

// 開く
btn.addEventListener("click", () => {
  overlay.style.display = "flex";
});

// 閉じる（×）
closeBtn.addEventListener("click", () => {
  overlay.style.display = "none";
});

// 背景クリックで閉じる
overlay.addEventListener("click", (e) => {
  if (e.target === overlay) {
    overlay.style.display = "none";
  }
});