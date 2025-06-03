
---

# 📊 Çalışanlar Uygulaması – Kotlin  -tr

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

---

# 📊 Employees Application – Kotlin --eng

This project is an **employee management** application built using Kotlin, which includes **object-oriented programming (OOP) and list operations**. The application keeps employee information and helps organize employee data by performing various filtering operations.

## 🚀 Features

- **Using a class (`class`) to manage employees.**
- **Initializing employee objects with Constructor.**
- **Storing employees with List (`ArrayList`) data structure.**
- **Sorting employees by age and department with filtering operations (`filter` and `map`).**
- **Keeping the salary variable `private` with Encapsulation.**

## 🔧 Installation

1. **Clone the project**:
```bash
git clone https://github.com/SELIMCNR/CalisanlarProjectBtkAkademiKotlin.git
```

2. **Open with Android Studio** and examine the `MainActivity.kt` file.

3. **Run the application**:
- You can run it on an emulator or a physical device.

## 📂 File Structure

```
/project_name
│── /app
│ ├── /src/main/java/com/example/calisanlarprojectbtkakademikotlin
│ │ ├── MainActivity.kt
│ │ ├── Calisanlar.kt
│ ├── /src/main/res
│── README.md
│── build.gradle
```

## 📝 Sample Code

### 🔹 **Employees Class**
```kotlin
class Employees(val name: String, private val salary: Int, val department: String, var age: Int) {
fun SalaryShow(): Int {
return salary
}
}
```

### 🔹 **Listing Employees**
```kotlin
val employeeListesi = arrayListOf(
Employees("Ali", 50000, "Sales", 30),
Employees("Kenan Yıldız", 100000, "Finance", 25),
Employees("Arda Güler", 100000, "Sales", 25),
Employees("Derya", 50000, "Software", 25)
)

// Printing employees with salary information
employeeListesi.forEach { println("${it.name} - Salary: ${it.MaasShow()}") }
```

### 🔹 **Filtering Examples**
```kotlin
// Filtering employees who are older than 28 and whose department is "Software"
val 2010BigDepartmentSoftware = employeeListesi.filter { it.age > 28 && it.department == "Software" }
2010BigDepartmentSoftware.forEach { println("${it.name} - Salary: ${it.ShowSalary()}") }

// Filtering employees who are younger than 26
val 2010Under26 = employeeListesi.filter { it.age < 26 }
2010Under26.forEach { println("${it.name} - Salary: ${it.ShowSalary()}") }
```

## 📌 Contribute

- You can make improvements by getting a **Fork**.
- You can share your suggestions by opening a `Pull Request`.

---
