Percobaan 1 – Review Perulangan 1

Jika i=1 diubah menjadi i=0, apa akibatnya?
Output akan menampilkan * sebanyak n+1 kali. Karena perulangan dimulai dari 0 dan berhenti saat i>n, maka ada satu iterasi tambahan.

Jika i<=n diubah menjadi i<n, bagaimana outputnya saat n=5?
Output menjadi **** (4 bintang). Karena kondisi berhenti sebelum i = n.

Jika i<=n diubah menjadi i>n, apa akibatnya?
Tidak ada output sama sekali. Karena kondisi awal i=1 tidak memenuhi i>n.

Jika i++ diubah menjadi i--, apa akibatnya?
Terjadi infinite loop (loop tak berakhir), karena nilai i terus berkurang dan tidak pernah memenuhi kondisi berhenti.

Jika i++ diubah menjadi i+=2, bagaimana pola outputnya jika n=6?
Output: *** (3 bintang). Karena perulangan naik dua langkah (1, 3, 5), jadi hanya setengah dari jumlah n.

🧩 Percobaan 2 – Bintang Persegi


Jika iOuter=1 diubah menjadi iOuter=0, apa akibatnya?
Output akan bertambah satu baris (n+1 baris), karena perulangan dimulai dari 0 hingga n.

Jika i=1 diubah menjadi i=0, apa akibatnya?
Setiap baris akan berisi n+1 bintang (satu bintang lebih banyak dari seharusnya).

Apa perbedaan antara perulangan luar dan perulangan dalam?

Perulangan luar (outer loop): mengatur jumlah baris.

Perulangan dalam (inner loop): mengatur jumlah bintang pada setiap baris.

Mengapa perlu ditambahkan System.out.println(); di bawah perulangan dalam?
Agar setiap baris bintang berpindah ke baris baru. Jika dihapus, semua bintang akan tampil dalam satu baris panjang.

🧩 Percobaan 3 – Bintang Segitiga


Apakah output dengan n=5 sesuai dengan contoh?
Tidak, karena pada kode awal baris terakhir tidak tercetak sempurna.

Bagian yang perlu diperbaiki:

Tambahkan System.out.println(); di dalam perulangan luar setelah inner loop.

Ubah kondisi while(i <= n) menjadi while(i <= n) (tetap benar), namun pastikan ada newline di tiap iterasi.

Peran variabel i dan j:

i: menghitung jumlah baris (outer loop).
j: menghitung jumlah bintang per baris (inner loop).
j harus di-reset ke 0 setiap kali outer loop berjalan agar setiap baris dimulai dari awal. Jika tidak di-reset, jumlah bintang akan terus bertambah tanpa kontrol.

 Percobaan 4 – Nilai Tugas Proyek Kelompok


Apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop?
totalNilai di-reset ke 0 setiap kali outer loop berjalan, agar perhitungan tiap kelompok tidak tercampur dengan kelompok sebelumnya.

Mengapa inisialisasi total=0 ada di dalam outer loop?
Karena setiap kelompok harus menghitung totalnya masing-masing. Jika di luar, nilai dari kelompok sebelumnya akan ikut dijumlahkan.
