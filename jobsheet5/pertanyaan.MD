
### 🧩 **Percobaan 1: IF dan IF-ELSE untuk Mencetak KRS**

**1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?**
Karena variabel yang diperiksa (`uktLunas`) bertipe **boolean**, yang hanya memiliki dua nilai: `true` atau `false`.
Kondisi `if (uktLunas)` sudah cukup untuk memeriksa apakah nilainya benar tanpa perlu operator seperti `==` atau `!=`.

**2. Saat program dijalankan, kemudian Anda mengisikan nilai `false`, bagaimana hasilnya?**
Tidak ada output “Silakan cetak KRS” karena kondisi `if (uktLunas)` bernilai **false**. Program tidak menampilkan apa pun (atau hanya keluar tanpa pesan).

**3. Jika pengguna memasukkan nilai `false`, sistem perlu menampilkan pesan penolakan.**
Setelah ditambahkan struktur `else`, maka hasilnya:

```
Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.
```

**4. Commit dan push:**
Pesan: `"Modifikasi Percobaan 1"`

---

### ⚙️ **Percobaan 2: SWITCH-CASE untuk Mencetak KRS**

**1. Apa fungsi dari sintaks `break`?**
`break` digunakan untuk **menghentikan eksekusi** di dalam satu blok `case`.
Tanpa `break`, program akan melanjutkan ke `case` berikutnya (disebut *fall-through*), sehingga hasil bisa tidak sesuai.

**2. Apa peran dari sintaks `default` pada struktur pemilihan SWITCH-CASE?**
`default` dijalankan jika **tidak ada nilai case yang cocok** dengan nilai variabel yang diperiksa.
Fungsinya mirip dengan `else` dalam struktur `if-else`.

**3. Transformasi ke bentuk IF-ELSE IF-ELSE:**
Gunakan struktur seperti ini:

```java
if (semester == 1) {
    System.out.println("KRS Semester 1");
} else if (semester == 2) {
    System.out.println("KRS Semester 2");
} else {
    System.out.println("Semester tidak ditemukan");
}
```

**4. Commit dan push:**
Pesan: `"Modifikasi Percobaan 2"`

---

### 🧠 **Percobaan 3: Nested IF untuk Mengecek Syarat Ujian Skripsi**

**1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?**
Program langsung menolak pendaftaran ujian skripsi karena **syarat pertama (bebas kompen)** tidak terpenuhi.
Sistem tidak melanjutkan ke pengecekan jumlah bimbingan.

**2. Jelaskan maksud dari potongan kode berikut!**

```java
if (bebasKompen.equalsIgnoreCase("Yes")) {
    if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
        pesan = "Anda dapat mendaftar ujian skripsi";
    } else {
        pesan = "Bimbingan belum memenuhi syarat";
    }
} else {
    pesan = "Tidak bebas kompen, tidak dapat mendaftar ujian skripsi";
}
```

Penjelasan:

* Pemeriksaan pertama mengecek apakah mahasiswa **bebas kompen** (`Yes`).
* Jika ya, maka diperiksa **jumlah bimbingan pembimbing 1 dan 2**.
* Jika syarat bimbingan terpenuhi, mahasiswa **boleh mendaftar**; jika tidak, **ditolak**.
* Jika tidak bebas kompen, langsung **gagal** tanpa mengecek bimbingan.

**3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir?**

1. Sistem menanyakan apakah mahasiswa **bebas kompen**.
2. Jika jawabannya **“No”**, sistem langsung menolak.
3. Jika jawabannya **“Yes”**, sistem lanjut memeriksa jumlah bimbingan:

   * Jika **bimbingan P1 ≥ 8** dan **bimbingan P2 ≥ 4**, mahasiswa dapat mendaftar.
   * Jika tidak memenuhi, sistem menampilkan pesan kegagalan.
