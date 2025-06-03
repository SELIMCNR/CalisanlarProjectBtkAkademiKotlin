package com.example.calisanlarprojectbtkakademikotlin

class Calisanlar (var isimGir: String,var maaşGir:Int,var departmanGir: String,var yasGir: Int)  {
    internal var isim = this.isimGir
            get
            private set

    private var maas = this.maaşGir
            private get
            private set
     var departman = this.departmanGir
      var yas = this.yasGir


   public fun MaasGoster():Int{
        return this.maas
    }


}