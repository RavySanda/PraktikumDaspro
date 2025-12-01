
# 🟦 **PERCOBAAN 1 — Array 2 Dimensi Dasar**

==============================================================

### **1. Apakah pengisian elemen array harus dilakukan berurutan mulai indeks ke-0?**

Tidak harus. Elemen dapat diisi dalam urutan apa pun selama indeks valid. Jika ada elemen yang belum diisi, nilainya akan menjadi **null** (untuk `String`).

---

### **2. Mengapa terdapat null pada daftar nama penonton?**

Karena elemen tersebut **belum diberi nilai**. Default value untuk tipe referensi seperti `String` adalah **null**.

---

### **3. Lengkapi daftar penonton**

Jawaban: seluruh elemen array harus diisi sesuai instruksi (baris 0–3, kolom 0–1).

---

### **4. Jelaskan fungsi `penonton.length` dan `penonton[0].length`.**

* **penonton.length** → jumlah baris pada array (misal 4).
* **penonton[0].length** → jumlah kolom pada baris pertama (misal 2).

**Apakah setiap baris memiliki length sama?**
Ya, karena array dibuat dengan ukuran tetap (4×2).

---

### **5. & 6. Menampilkan panjang setiap baris (for dan foreach)**

Keduanya menghasilkan informasi bahwa tiap baris memiliki panjang kolom yang sama, yaitu 2.

---

### **7. & 8. Menampilkan nama penonton pada baris ke-3**

Baris ke-3 (indeks 2) menampilkan dua nama sesuai isi array.

---

### **9. Menampilkan nama penonton untuk setiap baris**

Menampilkan seluruh isi array menggunakan nested loop.

---

### **10. Perbedaan foreach loop dan for loop**

| Foreach                             | For                                            |
| ----------------------------------- | ---------------------------------------------- |
| Lebih sederhana                     | Lebih fleksibel                                |
| Tidak menggunakan indeks            | Menggunakan indeks                             |
| Tidak bisa mengetahui posisi elemen | Bisa tahu posisi baris & kolom                 |
| Cocok untuk menampilkan data        | Cocok untuk modifikasi data & kondisi tertentu |

---

### **11. Indeks baris maksimal**

Jika jumlah baris 4 → indeks maksimal = **3**

---

### **12. Indeks kolom maksimal**

Jika jumlah kolom 2 → indeks maksimal = **1**

---

### **13. Fungsi `String.join()`**

Menggabungkan beberapa string menjadi satu dengan pemisah tertentu.
Contoh: `String.join(", ", "Ali", "Budi")` → `Ali, Budi`.

---

==============================================================

# 🟩 **PERCOBAAN 2 — Scanner & Pengisian Data**

==============================================================

### **1. Apakah input array harus dilakukan mulai indeks ke-0?**

Tidak. Dengan Scanner, pengguna dapat memilih indeks mana pun. Yang penting indeksnya valid.

---

### **2. Modifikasi program dengan menu**

Menu terdiri dari:

* **Menu 1:** Input data penonton
* **Menu 2:** Tampilkan daftar penonton
* **Menu 3:** Exit

---

### **3. Menangani baris atau kolom yang tidak tersedia**

Program harus menolak input di luar rentang:

* baris: 0–3
* kolom: 0–1
  Jika tidak sesuai, tampilkan pesan “Kursi tidak tersedia”.

---

### **4. Peringatan bila kursi sudah terisi**

Jika posisi array sudah memiliki nilai (bukan null), tampilkan pesan:
“Kursi sudah terisi, pilih kursi lain.”

---

### **5. Kursi kosong ditampilkan sebagai "***"**

Jika elemen bernilai null, tampilkan `***` untuk menandai kursi kosong.

---

==============================================================

# 🟧 **PERCOBAAN 3 — Array 2D Jagged (Baris Memiliki Panjang Berbeda)**

==============================================================

### **1. Menampilkan isi array**

Program menampilkan setiap baris dengan jumlah kolom berbeda-beda.

---

### **2. Fungsi `Arrays.toString()`**

Untuk menampilkan isi array 1 dimensi dalam format string rapi, misalnya:
`[0, 0, 0]`.

---

### **3. Default value untuk array int**

Nilai default elemen array bertipe `int` adalah **0**.

---

### **4. Menambahkan nested loop**

Menampilkan isi array elemen per elemen.

---

### **5. Apakah panjang array dapat diubah setelah dibuat?**

Tidak bisa. Jumlah baris dan kolom **tetap** setelah array dibuat.
Jika ingin ukuran baru, harus membuat array baru.

---

==============================================================

# 🟥 **PERCOBAAN 4 — Studi Kasus SIAKAD**

==============================================================

### **1. Bagaimana jika jumlah siswa dan jumlah mata kuliah berubah?**

Solusi:

* Gunakan input untuk menentukan jumlah siswa dan jumlah mata kuliah.
* Buat array dinamis:

```
int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];
```

* Seluruh proses perhitungan (rata-rata setiap siswa dan mata kuliah) mengikuti ukuran array tersebut.

Intinya: program harus fleksibel dan menyesuaikan ukuran array berdasarkan input pengguna.
