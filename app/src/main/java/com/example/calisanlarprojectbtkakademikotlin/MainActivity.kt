package com.example.calisanlarprojectbtkakademikotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var calisan1 = Calisanlar("Ali",50000,"Satış",30)
        var calisan2= Calisanlar("Kenan Yıldız",100000,"Finans",25)
        var calisan3 = Calisanlar("Arda Güler",100000,"Satış",28)
        var calisan4= Calisanlar("Derya",50000,"Yazılım",25)
        var calisan5 = Calisanlar("Alihan Tuncer",90000,"Finans",35)
        var calisan6  = Calisanlar("Cansu",55000,"Yazılım",40)

        var calisan7 = Calisanlar("Yusuf",75000,"Finans",25)
        var calisan8 = Calisanlar("İbrahim",150000,"Satış",28)
        var calisan9 = Calisanlar("Münire",100000,"Yazılım",30)
        var calisan10 = Calisanlar("Selim",100000,"Yazılım",30)
        println("${calisan1.isim} : ${calisan1.MaasGoster()}")
        println("${calisan2.isim} : ${calisan2.MaasGoster()}")
        println("${calisan3.isim} : ${calisan3.MaasGoster()}")
        println("${calisan4.isim} : ${calisan4.MaasGoster()}")
        println("${calisan5.isim} : ${calisan5.MaasGoster()}")
        println("${calisan6.isim} : ${calisan6.MaasGoster()}")
        println("${calisan7.isim} : ${calisan7.MaasGoster()}")
        println("${calisan8.isim} : ${calisan8.MaasGoster()}")
        println("${calisan9.isim} : ${calisan9.MaasGoster()}")
        println("${calisan10.isim} : ${calisan10.MaasGoster()}")

        var calisanListesi = arrayListOf(calisan1,calisan2,calisan3,calisan4,calisan5,calisan6,calisan7,calisan8,calisan9,calisan10)

        var yirmiSekizBuyukDepartmanYazılım = calisanListesi.filter {  it.yas > 28}.map {  it.departman == "Yazılım" }
        yirmiSekizBuyukDepartmanYazılım.forEach {
            println(it)
        }
        var yasiyirmiAltıdanKucuk = calisanListesi.filter { it.yas <26 }
            yasiyirmiAltıdanKucuk.forEach {
            println(it)
        }

    }


}