const overlay = document.getElementById("modalOverlay");

// モーダルを閉じる
const closeModal = () => {
　　overlay.style.display = "none";
};

// モーダルを開く
document.getElementById("itemAdd").addEventListener("click", () => {
  overlay.style.display = "flex";
});

// 閉じる（×）
document.getElementById("closeModalBtn").addEventListener("click", () => {
  closeModal();
});

// 背景クリックで閉じる
overlay.addEventListener("click", (e) => {
  if (e.target === overlay) {
　　　closeModal();
  }
});

document.getElementById("itemForm").addEventListener("submit", async function(e) {
  e.preventDefault();

  const data = {
    name: document.getElementById("name").value,
    cost: document.getElementById("cost").value,
  };

  await registerItem(data);

  closeModal();
});

async function registerItem(data) {
  const res = await fetch('/expenses-manager/api/items/add', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(data)
  });

  if (!res.ok) {
      alert('登録失敗');
      return;
    }

  const item = await res.json();
  appendItem(item);
}

const appendItem = item => {
  const tbody = document.getElementById('items-body');
  const tr = document.createElement('tr');
  const nameTd = document.createElement('td');

  nameTd.textContent = item.name;
  const costTd = document.createElement('td');
  costTd.textContent = item.cost;
  const createdAtTd = document.createElement('td');
  createdAtTd.textContent = item.createdAt;

  tr.append(nameTd, costTd, createdAtTd);
  tbody.prepend(tr); // 新しいものを上に
};