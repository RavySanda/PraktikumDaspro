### **Percobaan 1 – FOR**

1. Komponen FOR: **Inisialisasi (int i=1)**, **Kondisi (i<=10)**, **Increment (i++)**.
2. Tertinggi = 0 dan Terendah = 100 agar nilai awal dapat tergantikan. Jika dibalik, hasil salah.
3. Mengecek dan memperbarui nilai tertinggi dan terendah dari setiap input nilai mahasiswa.

---

### **Percobaan 2 – WHILE**

1. `nilai < 0 || nilai > 100` mengecek input tidak valid.
   `continue` melewati iterasi saat ini.
2. `i++` di akhir agar bertambah setelah input valid. Jika di awal, iterasi pertama terlewat.
3. Jika jumlah mahasiswa 19 → perulangan 19 kali.

---

### **Percobaan 3 – DO-WHILE**

1. Jika nama pelanggan pertama “batal” → perulangan tetap berjalan 1 kali, karena DO-WHILE selalu dieksekusi minimal sekali.
2. Kondisi berhenti: input nama = “batal”.
3. `true` membuat loop terus berjalan sampai ada `break`.
4. Tetap berjalan karena DO-WHILE minimal dijalankan sekali tanpa inisialisasi/update.