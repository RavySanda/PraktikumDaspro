## 🧪 **Percobaan 1 **

**Pertanyaan 1:**
Apa yang terjadi jika isi masing-masing elemen diubah menjadi `5.0`, `12867`, `7.5`, `2000000`? Mengapa?
**Jawaban:**
Akan terjadi *error* karena 5.0 dan 7.5 bertipe double, sedangkan array bertipe int. Nilai desimal tidak bisa dimasukkan ke array int tanpa konversi. Hanya 12867 dan 2000000 yang valid.


**Pertanyaan 3:**
Apa maksud dari statement:

for (int i = 0; i < 4; i++) 
    System.out.println(bil[i]);
**Jawaban:**
Perulangan tersebut menampilkan semua elemen array `bil` dari indeks 0 sampai 3.

---

**Pertanyaan 4:**
Apa yang terjadi jika kondisi diubah menjadi `i <= 4`?
**Jawaban:**
Akan muncul error `ArrayIndexOutOfBoundsException` karena indeks `4` tidak ada. Indeks terakhir hanya sampai `3`.


## 🧪 **Percobaan 2 **

**Pertanyaan 1:**
setelah ubah statement apakah terjadi perubahan
**Jawaban:**
Akan terjadi `ArrayIndexOutOfBoundsException` karena indeks array dimulai dari 0, bukan 1. Indeks valid hanya 0–9.

**Pertanyaan 2:**
Apa maksud dari kondisi `i < nilaiAkhir.length`?
**Jawaban:**
Artinya perulangan berjalan selama `i` kurang dari jumlah elemen array. Ini memastikan agar indeks tidak melebihi batas array.

**Pertanyaan 3:**
Bagaimana modifikasi program agar hanya menampilkan nilai mahasiswa yang > 70?
**Jawaban:**
Tambahkan kondisi `if (nilaiAkhir[i] > 70)` di dalam perulangan. Hanya nilai di atas 70 yang akan ditampilkan.


## 🧪 **Percobaan 4 **

**Pertanyaan 1:**
Apa maksud dari statement `break;`?
**Jawaban:**
`break;` digunakan untuk menghentikan perulangan saat nilai yang dicari sudah ditemukan agar program tidak melanjutkan pencarian yang tidak perlu.
