
---

# 📊 Çalışanlar Uygulaması – Kotlin 

Bu proje, Kotlin kullanılarak oluşturulmuş, **nesne yönelimli programlama (OOP) ve liste işlemleri** içeren **çalışan yönetimi** uygulamasıdır. Uygulama, çalışanların bilgilerini tutar ve çeşitli filtreleme işlemleri yaparak çalışan verilerini düzenlemeye yardımcı olur.

## 🚀 Özellikler

- **Çalışanları yönetmek için sınıf (`class`) kullanımı.**
- **Constructor ile çalışan nesnelerinin başlatılması.**
- **Liste (`ArrayList`) veri yapısı ile çalışanların saklanması.**
- **Filtreleme işlemleri (`filter` ve `map`) ile çalışanları yaş ve departmana göre sıralama.**
- **Encapsulation (Kapsülleme) ile maaş değişkeninin `private` tutulması.**

## 🔧 Kurulum 

1. **Projeyi klonlayın**:
   ```bash
   git clone https://github.com/SELIMCNR/CalisanlarProjectBtkAkademiKotlin.git
   ```

2. **Android Studio ile açın** ve `MainActivity.kt` dosyasını inceleyin.

3. **Uygulamayı çalıştırın**:
   - Emülatör veya fiziksel cihazda çalıştırabilirsiniz.

## 📂 Dosya Yapısı

```
/proje_adı
│── /app
│    ├── /src/main/java/com/example/calisanlarprojectbtkakademikotlin
│    │   ├── MainActivity.kt
│    │   ├── Calisanlar.kt
│    ├── /src/main/res
│── README.md
│── build.gradle
```

## 📝 Örnek Kod

### 🔹 **Çalışanlar Sınıfı**
```kotlin
class Calisanlar(val isim: String, private val maas: Int, val departman: String, var yas: Int) {
    fun MaasGoster(): Int {
        return maas
    }
}
```

### 🔹 **Çalışanların Listelenmesi**
```kotlin
val calisanListesi = arrayListOf(
    Calisanlar("Ali", 50000, "Satış", 30),
    Calisanlar("Kenan Yıldız", 100000, "Finans", 25),
    Calisanlar("Arda Güler", 100000, "Satış", 25),
    Calisanlar("Derya", 50000, "Yazılım", 25)
)

// Çalışanları maaş bilgisi ile yazdırma
calisanListesi.forEach { println("${it.isim} - Maaş: ${it.MaasGoster()}") }
```

### 🔹 **Filtreleme Örnekleri**
```kotlin
// 28 yaşından büyük ve departmanı "Yazılım" olan çalışanları filtreleme
val yirmiSekizBuyukDepartmanYazılım = calisanListesi.filter { it.yas > 28 && it.departman == "Yazılım" }
yirmiSekizBuyukDepartmanYazılım.forEach { println("${it.isim} - Maaş: ${it.MaasGoster()}") }

// 26 yaşından küçük olan çalışanları filtreleme
val yasiyirmiAltıdanKucuk = calisanListesi.filter { it.yas < 26 }
yasiyirmiAltıdanKucuk.forEach { println("${it.isim} - Maaş: ${it.MaasGoster()}") }
```

## 📌 Katkıda Bulunma

- **Fork** alarak geliştirmeler yapabilirsiniz.
- `Pull Request` açarak önerilerinizi paylaşabilirsiniz.

---
