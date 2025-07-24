# ⭐ Ters Sağ Dik Üçgen Oluşturma (Java)

Bu proje, Java programlama dili kullanılarak kullanıcıdan alınan bir yükseklik değeriyle ters yönlü bir **sağ dik üçgen** oluşturur. Her satırda bir önceki satıra göre bir yıldız eksilerek sola yaslı bir üçgen deseni elde edilir.

---

## 📌 Örnek Çıktı (`yükseklik = 5` için)

```
*****
****
***
**
*
```

---

## 🧠 Nasıl Çalışır?

- Kullanıcıdan bir `yükseklik` değeri alınır.
- Dış `for` döngüsü satırları kontrol eder.
- İç `for` döngüsü, her satırda yazdırılacak yıldız `*` karakterlerini basar.
- Her satırda yıldız sayısı bir azalır.
- Desen sola yaslı ve sağ açısı alt köşededir.

---

## 💻 Kod

```java
import java.util.Scanner;

public class ReverseRightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yükseklik alınır
        System.out.print("Yüksekliği girin: ");
        int height = input.nextInt();

        // Satırları kontrol eden dış döngü
        for (int i = height; i > 0; i--) {
            // Her satırda yıldız basan iç döngü
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Alt satıra geç
            System.out.println();
        }

        input.close();
    }
}
```

---

## 🔄 Döngü Açıklaması

### Dış Döngü – Satır Sayısı:
```java
for (int i = height; i > 0; i--)
```
- `i` değeri yükseklikten başlar, 1’e kadar azalır.
- Her değeri bir satırı temsil eder.

### İç Döngü – Yıldız Sayısı:
```java
for (int j = 0; j < i; j++)
```
- Her satırda kaç yıldız yazılacağını belirler.
- `j`, 0'dan başlayarak `i`'ye kadar çalışır.

---

## 🧪 Örnek Giriş/Çıkış

**Giriş:**
```
Yüksekliği girin: 4
```

**Çıkış:**
```
****
***
**
*
```

---

## ✍️ Yazan

**Süleyman Berk Erduran**  
Java ile algoritma ve desen pratiği.

---

## 📁 Lisans

Bu proje, dilediğiniz gibi kullanmanız ve geliştirmeniz için özgürdür.
