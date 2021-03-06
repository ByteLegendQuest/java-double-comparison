# [ByteLegend](https://bytelegend.com) Challenge of JavaIsland: Double Comparison

<details open='true'>
<summary>English</summary>

## Implement `double` comparison

There is a surprising fact in [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java) - `0.1+0.2==0.3` is `false`!
This is due to the fact that binary floating-point numbers can't represent decimal fractions precisely.
In practice, if we have to compare two floating-point numbers for equality, we usually calculate the difference of them,
and the difference is less than  a certain small number (aka. `ε`, `epsilon`), we consider them equal.

Please fix the `doubleEquals` method so that the program runs with output:

```
0.1+0.2==0.3: true
```
- You can accomplish this challenge via any way below:
  - Recommended for beginners: run `git clone https://github.com/ByteLegendQuest/java-double-comparison` to download the code,
    finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
    - If you don't know how, you can click [import project into IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md)/[import project into VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md).
    - Before submitting your code, you'd better run `mvn verify` locally to save time. Don't know how? See [verify locally in IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md)/[verify locally in VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md).
  - Very unrecommended: you can [click here to download zipped code](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main) if you don't like `git` operations.
  - Or: if you are confident enough to write code in web editor directly, go ahead.
  - Or: if you are familiar with GitHub, you can fork [the repo](https://github.com/ByteLegendQuest/java-double-comparison), finish the challenge and create a pull request.
- The bot will check your PR and tell you if you accomplish the challenge.
- Go back to [ByteLegend](https://bytelegend.com) and continue your hero journey.

Good luck!

If you need any help, feel free to join the [Discord Community](https://discord.gg/35RreUUGWt) or contact us via [contact@bytelegend.com](mailto:contact@bytelegend.com).

**Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:**

- `src/main/java/com/bytelegend/Main.java`

</details>

<details>
<summary>简体中文</summary>

## 实现两个`double`类型的比较

[src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java)中有一个令人吃惊的现象，`0.1+0.2==0.3`的结果竟然是`false`！
这是由于浮点数本身的特性导致的：二进制的浮点数无法精确的表示十进制的小数。
在实践中，要比较两个浮点数是否相等，我们通常计算它们的差值，若二者之差小于某个很小的数字（称为`ε`, `epsilon`），我们就认为它们相等。
请基于这一思想修复`doubleEquals`方法，使程序运行输出：

```
0.1+0.2==0.3: true
```
- 你可以使用以下任意一种方法完成挑战：
  - 初学者推荐：运行`git clone https://git.bytelegend.com/ByteLegendQuest/java-double-comparison`将代码下载到本地，在本地使用IDE调试完成后复制到网页编辑器里提交。
    - 如果你不知道怎么做，可以点击[导入IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/zh_hans/clone-and-import.md)/[导入VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/zh_hans/clone-and-import-vscode.md)。
    - 在提交之前，你最好先在本地运行`mvn verify`验证一下答案，以节约时间。不知道如何做？请查看[在IDEA中本地验证](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/zh_hans/run-mvn-verify-idea.md)/[在VSCode中本地验证](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/zh_hans/run-mvn-verify-vscode.md)。
  - 非常不推荐：如果你实在不喜欢`git`命令行操作，你可以[点击这里直接下载打包好的代码](https://ghcodeload.bytelegend.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main)。
  - 或者：如果你非常自信不需要下载代码到本地调试，可以使用网页编辑器直接提交。
  - 或者：如果你对GitHub非常熟悉，你可以fork[这个仓库](https://github.com/ByteLegendQuest/java-double-comparison)、完成挑战后，创建一个Pull Request。
- 机器人将会检查你的答案，告诉你你是否通过了挑战。
- 回到[字节传说](https://bytelegend.com)，然后继续你的英雄旅程。

祝你好运！

如果你需要任何帮助，欢迎加入官方玩家QQ群（在[首页](https://bytelegend.com)右下角的`联系 & 关于`菜单里可以找到入群方式）或者[Discord社区](https://discord.gg/PvmqK3hF)，或email至[contact@bytelegend.com](mailto:contact@bytelegend.com)。

**注意：我们只允许您修改以下文件，任何对其他文件的修改都会被拒绝：**

- `src/main/java/com/bytelegend/Main.java`

</details>

<details>
<summary>繁體中文</summary>

實現`double`比較
------------

[src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java)中有一個令人驚訝的事實 - `0.1+0.2==0.3`是`false`的！這是因為二進制浮點數不能精確地表示小數。在實踐中，如果我們必須比較兩個浮點數是否相等，我們通常會計算它們的差異，並且差異小於某個小數（aka. `ε` , `epsilon` ），我們認為它們相等。

請修復`doubleEquals`方法，以便程序運行並輸出：

    0.1+0.2==0.3: true
    

-   您可以通過以下任何方式完成此挑戰：
    -   建議初學者：運行`git clone https://github.com/ByteLegendQuest/java-double-comparison`下載代碼，在本地 IDE 中完成挑戰，然後在 Web 編輯器中復制/粘貼/提交答案。
        -   如果你不知道怎麼做，你可以點擊[import project into IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md) 。
        -   在提交代碼之前，您最好在本地運行`mvn verify`以節省時間。不知道怎麼樣？請參閱[在 IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md) [中進行本地驗證/在 VSCode 中進行本地驗證](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md)。
    -   非常不推薦：如果你不喜歡`git`操作，可以[點擊這裡下載壓縮代碼](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main)。
    -   或者：如果您有足夠的信心直接在 Web 編輯器中編寫代碼，請繼續。
    -   或者：如果你熟悉 GitHub，你可以 fork[倉庫](https://github.com/ByteLegendQuest/java-double-comparison)，完成挑戰並創建一個拉取請求。
-   機器人會檢查你的 PR 並告訴你是否完成了挑戰。
-   回到[ByteLegend](https://bytelegend.com)繼續你的英雄之旅。

祝你好運！

如果您需要任何幫助，請隨時加入[Discord 社區](https://discord.gg/35RreUUGWt)或通過[contact@bytelegend.com](mailto:contact@bytelegend.com)聯繫我們。

**注意：我們只允許您修改以下文件。對以下文件以外的文件的任何更改都將被拒絕：**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Español</summary>

Implementar `double` comparación
--------------------------------

Hay un hecho sorprendente en [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java) : ¡ `0.1+0.2==0.3` es `false` ! Esto se debe al hecho de que los números binarios de punto flotante no pueden representar fracciones decimales con precisión. En la práctica, si tenemos que comparar la igualdad de dos números de punto flotante, generalmente calculamos la diferencia entre ellos, y la diferencia es menor que un cierto número pequeño (también conocido como `ε` , `epsilon` ), los consideramos iguales.

Corrija el método `doubleEquals` para que el programa se ejecute con salida:

    0.1+0.2==0.3: true
    

-   Puede lograr este desafío de cualquier manera a continuación:
    -   Recomendado para principiantes: ejecute `git clone https://github.com/ByteLegendQuest/java-double-comparison` para descargar el código, finalice el desafío en su IDE local, luego copie/pegue/envíe la respuesta en el editor web.
        -   Si no sabe cómo hacerlo, puede hacer clic en [importar proyecto a IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md) / [importar proyecto a VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar su código, es mejor que ejecute `mvn verify` localmente para ahorrar tiempo. ¿No sabes cómo? Ver [verificar localmente en IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente en VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muy poco recomendado: puede [hacer clic aquí para descargar el código comprimido](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main) si no le gustan las operaciones de `git` .
    -   O: si tiene la confianza suficiente para escribir código en el editor web directamente, adelante.
    -   O: si está familiarizado con GitHub, puede bifurcar [el repositorio](https://github.com/ByteLegendQuest/java-double-comparison) , finalizar el desafío y crear una solicitud de extracción.
-   El bot verificará tu PR y te dirá si logras el desafío.
-   Regrese a [ByteLegend](https://bytelegend.com) y continúe su viaje de héroe.

¡Buena suerte!

Si necesita ayuda, no dude en unirse a la [comunidad de Discord](https://discord.gg/35RreUUGWt) o contáctenos a través de [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: solo le permitimos modificar los siguientes archivos. Cualquier cambio en los archivos que no sean los siguientes archivos será rechazado:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>العربية</summary>

تنفيذ مقارنة `double`
---------------------

هناك حقيقة مفاجئة في [src / main / java / com / bytelegend / Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java) - `0.1+0.2==0.3` `false` ! هذا يرجع إلى حقيقة أن أرقام الفاصلة العائمة الثنائية لا يمكن أن تمثل الكسور العشرية بدقة. من الناحية العملية ، إذا كان علينا مقارنة عددين من الفاصلة العائمة من أجل المساواة ، فعادة ما نحسب الفرق بينهما ، والفرق أقل من رقم صغير معين (يُعرف أيضًا باسم `ε` ، `epsilon` ) ، فنحن نعتبرهما متساويين.

يرجى إصلاح طريقة `doubleEquals` بحيث يعمل البرنامج مع الإخراج:

 `0.1+0.2==0.3: true`

-   يمكنك إنجاز هذا التحدي بأي طريقة أدناه:
    -   موصى به للمبتدئين: قم بتشغيل `git clone https://github.com/ByteLegendQuest/java-double-comparison` لتنزيل الكود وإنهاء التحدي في IDE المحلي الخاص بك ، ثم نسخ / لصق / إرسال الإجابة في محرر الويب.
        -   إذا كنت لا تعرف كيف يمكنك النقر فوق [استيراد مشروع إلى IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md) / [استيراد مشروع إلى VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md) .
        -   قبل إرسال التعليمات البرمجية الخاصة بك ، من الأفضل تشغيل `mvn verify` محليًا لتوفير الوقت. لا أعرف كيف؟ انظر [التحقق محليًا في IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md) / [تحقق محليًا في VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   غير موصى به على الإطلاق: يمكنك [النقر هنا لتنزيل رمز مضغوط](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main) إذا كنت لا تحب عمليات `git` .
    -   أو: إذا كنت واثقًا بدرجة كافية من كتابة التعليمات البرمجية في محرر الويب مباشرةً ، فابدأ.
    -   أو: إذا كنت معتادًا على GitHub ، فيمكنك تفرع [الريبو](https://github.com/ByteLegendQuest/java-double-comparison) وإنهاء التحدي وإنشاء طلب سحب.
-   سيتحقق الروبوت من العلاقات العامة الخاصة بك ويخبرك إذا أنجزت التحدي.
-   ارجع إلى [ByteLegend وتابع](https://bytelegend.com) رحلة بطلك.

حظ سعيد!

إذا كنت بحاجة إلى أي مساعدة ، فلا تتردد في الانضمام إلى [مجتمع Discord](https://discord.gg/35RreUUGWt) أو الاتصال بنا عبر [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**ملاحظة: نسمح لك فقط بتعديل الملفات التالية. سيتم رفض أي تغييرات يتم إجراؤها على الملفات بخلاف الملفات التالية:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Português</summary>

Implementar `double` comparação
-------------------------------

Há um fato surpreendente em [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java) - `0.1+0.2==0.3` é `false` ! Isso se deve ao fato de que os números binários de ponto flutuante não podem representar frações decimais com precisão. Na prática, se temos que comparar dois números de ponto flutuante para igualdade, geralmente calculamos a diferença deles, e a diferença é menor que um certo número pequeno (aka. `ε` , `epsilon` ), nós os consideramos iguais.

Por favor, corrija o método `doubleEquals` para que o programa seja executado com saída:

    0.1+0.2==0.3: true
    

-   Você pode realizar esse desafio de qualquer maneira abaixo:
    -   Recomendado para iniciantes: execute `git clone https://github.com/ByteLegendQuest/java-double-comparison` para baixar o código, conclua o desafio em seu IDE local e copie/cole/envie a resposta no editor da web.
        -   Se você não sabe como, você pode clicar em [import project into IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar seu código, é melhor você executar `mvn verify` localmente para economizar tempo. Não sei como? Consulte [verificar localmente em IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente em VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muito não recomendado: você pode [clicar aqui para baixar o código zipado](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main) se não gostar das operações do `git` .
    -   Ou: se você estiver confiante o suficiente para escrever código diretamente no editor da web, vá em frente.
    -   Ou: se você estiver familiarizado com o GitHub, você pode bifurcar [o repo](https://github.com/ByteLegendQuest/java-double-comparison) , finalizar o desafio e criar um pull request.
-   O bot verificará seu PR e informará se você cumprir o desafio.
-   Volte para [ByteLegend](https://bytelegend.com) e continue sua jornada de herói.

Boa sorte!

Se precisar de ajuda, sinta-se à vontade para se juntar à [Comunidade Discord](https://discord.gg/35RreUUGWt) ou entre em contato conosco via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: só permitimos que você modifique os seguintes arquivos. Quaisquer alterações em arquivos que não sejam os arquivos a seguir serão rejeitadas:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Bahasa Indonesia</summary>

Terapkan perbandingan `double`
------------------------------

Ada fakta mengejutkan di [src/main/Java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java) - `0.1+0.2==0.3` is `false` ! Hal ini disebabkan fakta bahwa bilangan biner floating-point tidak dapat mewakili pecahan desimal secara tepat. Dalam praktiknya, jika kita harus membandingkan dua angka floating-point untuk kesetaraan, kita biasanya menghitung perbedaannya, dan perbedaannya kurang dari angka kecil tertentu (alias `epsilon` `ε` , kita menganggapnya sama.

Harap perbaiki metode `doubleEquals` agar program berjalan dengan output:

    0.1+0.2==0.3: true
    

-   Anda dapat menyelesaikan tantangan ini melalui cara apa pun di bawah ini:
    -   Direkomendasikan untuk pemula: jalankan `git clone https://github.com/ByteLegendQuest/java-double-comparison` untuk mengunduh kode, selesaikan tantangan di IDE lokal Anda, lalu salin/tempel/kirim jawabannya di editor web.
        -   Jika Anda tidak tahu caranya, Anda bisa mengklik [import project into IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Sebelum mengirimkan kode Anda, Anda sebaiknya menjalankan `mvn verify` secara lokal untuk menghemat waktu. Tidak tahu bagaimana? Lihat [verifikasi secara lokal di IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md) / [verifikasi secara lokal di VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sangat tidak direkomendasikan: Anda dapat [mengklik di sini untuk mengunduh kode zip](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main) jika Anda tidak menyukai operasi `git` .
    -   Atau: jika Anda cukup percaya diri untuk menulis kode di editor web secara langsung, silakan.
    -   Atau: jika Anda terbiasa dengan GitHub, Anda dapat melakukan fork [repo](https://github.com/ByteLegendQuest/java-double-comparison) , menyelesaikan tantangan, dan membuat permintaan tarik.
-   Bot akan memeriksa PR Anda dan memberi tahu Anda jika Anda menyelesaikan tantangan.
-   Kembali ke [ByteLegend](https://bytelegend.com) dan lanjutkan perjalanan pahlawan Anda.

Semoga beruntung!

Jika Anda memerlukan bantuan, jangan ragu untuk bergabung dengan [Komunitas Discord](https://discord.gg/35RreUUGWt) atau hubungi kami melalui [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Catatan: kami hanya mengizinkan Anda untuk mengubah file berikut. Setiap perubahan pada file selain file berikut akan ditolak:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Français</summary>

Implémenter `double` comparaison
--------------------------------

Il y a un fait surprenant dans [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java) - `0.1+0.2==0.3` est `false` ! Cela est dû au fait que les nombres binaires à virgule flottante ne peuvent pas représenter précisément les fractions décimales. En pratique, si nous devons comparer deux nombres à virgule flottante pour l'égalité, nous calculons généralement leur différence, et la différence est inférieure à un certain petit nombre (aka. `ε` , `epsilon` ), nous les considérons comme égaux.

Veuillez corriger la méthode `doubleEquals` afin que le programme s'exécute avec la sortie :

    0.1+0.2==0.3: true
    

-   Vous pouvez accomplir ce défi de n'importe quelle manière ci-dessous:
    -   Recommandé pour les débutants : exécutez `git clone https://github.com/ByteLegendQuest/java-double-comparison` pour télécharger le code, terminez le défi dans votre IDE local, puis copiez/collez/soumettez la réponse dans l'éditeur Web.
        -   Si vous ne savez pas comment, vous pouvez cliquer sur [importer le projet dans IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md) / [importer le projet dans VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Avant de soumettre votre code, vous feriez mieux d'exécuter `mvn verify` localement pour gagner du temps. Vous ne savez pas comment ? Voir [vérifier localement dans IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md) / [vérifier localement dans VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Très déconseillé : vous pouvez [cliquer ici pour télécharger le code compressé](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main) si vous n'aimez pas les opérations `git` .
    -   Ou : si vous êtes suffisamment confiant pour écrire du code directement dans l'éditeur Web, continuez.
    -   Ou : si vous êtes familier avec GitHub, vous pouvez forker [le dépôt](https://github.com/ByteLegendQuest/java-double-comparison) , terminer le défi et créer une demande d'extraction.
-   Le bot vérifiera votre PR et vous dira si vous accomplissez le défi.
-   Retournez à [ByteLegend](https://bytelegend.com) et continuez votre voyage de héros.

Bonne chance!

Si vous avez besoin d'aide, n'hésitez pas à rejoindre la [communauté Discord](https://discord.gg/35RreUUGWt) ou à nous contacter via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Remarque : nous vous autorisons uniquement à modifier les fichiers suivants. Toute modification de fichiers autres que les fichiers suivants sera rejetée :**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>日本語</summary>

`double`比較を実装する
---------------

[src / main / java / com / bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java)に驚くべき事実があります`0.1+0.2==0.3`は`false`です！これは、2進数の浮動小数点数が小数を正確に表すことができないためです。実際には、2つの浮動小数点数を比較して等しいかどうかを比較する必要がある場合、通常はそれらの差を計算し、その差が特定の小さい数（別名、 `ε` 、 `epsilon` ）よりも小さい場合、それらは等しいと見なします。

プログラムが出力で実行されるように、 `doubleEquals`メソッドを修正してください。

    0.1+0.2==0.3: true
    

-   この課題は、以下のいずれかの方法で達成できます。
    -   初心者に推奨： `git clone https://github.com/ByteLegendQuest/java-double-comparison`を実行してコードをダウンロードし、ローカルIDEでチャレンジを終了してから、Webエディターで回答をコピー/貼り付け/送信します。
        -   方法がわからない場合は、\[ [プロジェクトをIDEAにインポート](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md)\]/\[ [プロジェクトをVSCodeにインポート](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md)\]をクリックできます。
        -   コードを送信する前に、時間を節約するためにローカルで`mvn verify`実行することをお勧めします。方法がわかりませんか？ [IDEAでローカルに](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md)[検証する/VSCodeでローカルに](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md)検証するを参照してください。
    -   非常に推奨されていません`git`操作が気に入らない場合は、 [ここをクリックしてzipコードをダウンロード](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main)できます。
    -   または：Webエディターで直接コードを記述できる自信がある場合は、先に進んでください。
    -   または：GitHubに精通している場合は[、リポジトリ](https://github.com/ByteLegendQuest/java-double-comparison)をフォークしてチャレンジを終了し、プルリクエストを作成できます。
-   ボットはPRをチェックし、チャレンジを達成したかどうかを通知します。
-   [ByteLegend](https://bytelegend.com)に戻り、ヒーローの旅を続けてください。

幸運を！

ヘルプが必要な場合は、 [Discordコミュニティ](https://discord.gg/35RreUUGWt)に参加するか、contact [@bytelegend.com](mailto:contact@bytelegend.com)からお問い合わせください。

**注：変更できるのは次のファイルのみです。次のファイル以外のファイルへの変更は拒否されます。**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Русский</summary>

Реализовать `double` сравнение
------------------------------

В [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java) есть удивительный факт - `0.1+0.2==0.3` `false` ! Это связано с тем, что двоичные числа с плавающей запятой не могут точно представлять десятичные дроби. На практике, если нам приходится сравнивать два числа с плавающей запятой на равенство, мы обычно вычисляем их разность, и разница меньше некоторого небольшого числа (он же `ε` , `epsilon` ), мы считаем их равными.

Пожалуйста, исправьте метод `doubleEquals` , чтобы программа работала с выводом:

    0.1+0.2==0.3: true
    

-   Вы можете выполнить эту задачу любым способом, указанным ниже:
    -   Рекомендуется для начинающих: запустите `git clone https://github.com/ByteLegendQuest/java-double-comparison` , чтобы загрузить код, завершите задание в локальной среде IDE, затем скопируйте/вставьте/отправьте ответ в веб-редакторе.
        -   Если вы не знаете как, вы можете нажать [импортировать проект в IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md) / [импортировать проект в VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Перед отправкой кода вам лучше запустить `mvn verify` локально, чтобы сэкономить время. Не знаете как? См. « [Проверить локально в IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md) / [проверить локально в VSCode»](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Крайне не рекомендуется: вы можете [нажать здесь, чтобы загрузить заархивированный код](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main) , если вам не нравятся операции `git` .
    -   Или: если вы достаточно уверены, чтобы писать код напрямую в веб-редакторе, вперед.
    -   Или: если вы знакомы с GitHub, вы можете разветвить [репозиторий](https://github.com/ByteLegendQuest/java-double-comparison) , выполнить задание и создать запрос на включение.
-   Бот проверит ваш PR и сообщит, выполнили ли вы задание.
-   Вернитесь в [ByteLegend](https://bytelegend.com) и продолжайте свое героическое путешествие.

Удачи!

Если вам нужна помощь, присоединяйтесь к [сообществу Discord](https://discord.gg/35RreUUGWt) или свяжитесь с нами по [адресу contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Примечание: мы разрешаем вам изменять только следующие файлы. Любые изменения в файлах, кроме следующих файлов, будут отклонены:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Deutsch</summary>

Implementieren Sie einen `double` Vergleich
-------------------------------------------

Es gibt eine überraschende Tatsache in [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java) - `0.1+0.2==0.3` ist `false` ! Dies liegt daran, dass binäre Gleitkommazahlen Dezimalbrüche nicht genau darstellen können. Wenn wir zwei Fließkommazahlen auf Gleichheit vergleichen müssen, berechnen wir in der Praxis normalerweise die Differenz von ihnen, und die Differenz ist kleiner als eine bestimmte kleine Zahl (auch bekannt als `ε` , `epsilon` ), wir betrachten sie als gleich.

Bitte korrigieren Sie die Methode `doubleEquals` , damit das Programm mit Ausgabe läuft:

    0.1+0.2==0.3: true
    

-   Sie können diese Herausforderung auf eine der folgenden Arten meistern:
    -   Empfohlen für Anfänger: Führen Sie `git clone https://github.com/ByteLegendQuest/java-double-comparison` aus, um den Code herunterzuladen, beenden Sie die Herausforderung in Ihrer lokalen IDE und kopieren/fügen Sie dann die Antwort im Web-Editor ein/übermitteln Sie sie.
        -   Wenn Sie nicht wissen wie, können Sie auf [Projekt in IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md) [importieren / Projekt in VSCode importieren klicken](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Bevor Sie Ihren Code einreichen, sollten Sie `mvn verify` besser lokal ausführen, um Zeit zu sparen. Sie wissen nicht wie? Siehe [Lokal verifizieren in IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md) / [Lokal verifizieren in VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sehr nicht zu empfehlen: Sie können [hier klicken, um den gezippten Code herunterzuladen,](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main) wenn Sie `git` -Operationen nicht mögen.
    -   Oder: Wenn Sie sicher genug sind, Code direkt im Web-Editor zu schreiben, fahren Sie fort.
    -   Oder: Wenn Sie mit GitHub vertraut sind, können Sie [das Repo forken](https://github.com/ByteLegendQuest/java-double-comparison) , die Challenge beenden und einen Pull-Request erstellen.
-   Der Bot überprüft Ihre PR und teilt Ihnen mit, ob Sie die Herausforderung meistern.
-   Gehen Sie zurück zu [ByteLegend](https://bytelegend.com) und setzen Sie Ihre Heldenreise fort.

Viel Glück!

Wenn Sie Hilfe benötigen, können Sie sich gerne der [Discord Community](https://discord.gg/35RreUUGWt) anschließen oder uns über [contact@bytelegend.com kontaktieren](mailto:contact@bytelegend.com) .

**Hinweis: Wir erlauben Ihnen nur, die folgenden Dateien zu ändern. Alle Änderungen an anderen Dateien als den folgenden Dateien werden abgelehnt:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>한국어</summary>

`double` 비교 구현
--------------

[src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java) 에 놀라운 사실이 있습니다. `0.1+0.2==0.3` 은 `false` 입니다! 이는 이진 부동 소수점 숫자가 소수를 정확하게 나타낼 수 없기 때문입니다. 실제로 두 개의 부동 소수점 숫자가 같은지 비교해야 하는 경우 일반적으로 그 차이를 계산하고 그 차이가 특정 작은 숫자(일명 `ε` , `epsilon` )보다 작으면 동일한 것으로 간주합니다.

프로그램이 출력과 함께 실행되도록 `doubleEquals` 메서드를 수정하십시오.

    0.1+0.2==0.3: true
    

-   아래 방법을 통해 이 챌린지를 완료할 수 있습니다.
    -   초보자를 위한 권장 사항: `git clone https://github.com/ByteLegendQuest/java-double-comparison` 을 실행하여 코드를 다운로드하고 로컬 IDE에서 챌린지를 완료한 다음 웹 편집기에서 답변을 복사/붙여넣기/제출합니다.
        -   방법을 모르는 경우 [프로젝트를 IDEA로](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md) [가져오기 / 프로젝트를 VSCode로 가져](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md) 오기를 클릭할 수 있습니다.
        -   코드를 제출하기 전에 시간을 절약하기 위해 로컬에서 `mvn verify` 를 실행하는 것이 좋습니다. 방법을 모르십니까? [IDEA에서 로컬로](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md) [확인/VSCode에서 로컬로](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md) 확인을 참조하세요.
    -   매우 권장하지 않음: `git` 작업이 마음에 들지 않으면 [여기를 클릭하여 압축 코드를 다운로드](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main) 할 수 있습니다.
    -   또는 웹 편집기에서 직접 코드를 작성할 만큼 자신이 있다면 계속 진행하십시오.
    -   또는 GitHub에 익숙하다면 리포지토리를 분기 [하고](https://github.com/ByteLegendQuest/java-double-comparison) 챌린지를 완료하고 풀 요청을 생성할 수 있습니다.
-   봇은 PR을 확인하고 도전 과제를 달성했는지 알려줍니다.
-   [ByteLegend](https://bytelegend.com) 로 돌아가 영웅 여정을 계속하세요.

행운을 빕니다!

도움이 필요하면 언제든지 [Discord 커뮤니티](https://discord.gg/35RreUUGWt) 에 가입하거나 [contact@bytelegend.com](mailto:contact@bytelegend.com) 을 통해 문의하세요.

**참고: 다음 파일만 수정할 수 있습니다. 다음 파일 이외의 파일에 대한 변경 사항은 거부됩니다.**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Italiano</summary>

Implementare il `double` confronto
----------------------------------

C'è un fatto sorprendente in [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/src/main/java/com/bytelegend/Main.java) - `0.1+0.2==0.3` è `false` ! Ciò è dovuto al fatto che i numeri binari a virgola mobile non possono rappresentare con precisione le frazioni decimali. In pratica, se dobbiamo confrontare due numeri in virgola mobile per l'uguaglianza, di solito ne calcoliamo la differenza e la differenza è inferiore a un certo numero piccolo (aka. `ε` , `epsilon` ), li consideriamo uguali.

Correggi il metodo `doubleEquals` in modo che il programma venga eseguito con l'output:

    0.1+0.2==0.3: true
    

-   Puoi portare a termine questa sfida in qualsiasi modo di seguito:
    -   Consigliato per i principianti: esegui `git clone https://github.com/ByteLegendQuest/java-double-comparison` per scaricare il codice, completa la sfida nel tuo IDE locale, quindi copia/incolla/invia la risposta nell'editor web.
        -   Se non sai come fare, puoi fare clic su [importa progetto in IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import.md) / [importa progetto in VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Prima di inviare il codice, è meglio eseguire `mvn verify` in locale per risparmiare tempo. Non sai come? Vedere [verifica in locale in IDEA](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-idea.md) / [verifica in locale in VSCode](https://github.com/ByteLegendQuest/java-double-comparison/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Molto sconsigliato: puoi fare [clic qui per scaricare il codice zippato](https://codeload.github.com/ByteLegendQuest/java-double-comparison/zip/refs/heads/main) se non ti piacciono le operazioni `git` .
    -   Oppure: se sei abbastanza sicuro da scrivere il codice direttamente nell'editor web, vai avanti.
    -   Oppure: se hai familiarità con GitHub, puoi eseguire il fork [del repository](https://github.com/ByteLegendQuest/java-double-comparison) , completare la sfida e creare una richiesta pull.
-   Il bot controllerà il tuo PR e ti dirà se hai superato la sfida.
-   Torna a [ByteLegend](https://bytelegend.com) e continua il tuo viaggio da eroe.

Buona fortuna!

Se hai bisogno di aiuto, non esitare a unirti alla [community di Discord](https://discord.gg/35RreUUGWt) o contattaci tramite [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: ti permettiamo solo di modificare i seguenti file. Eventuali modifiche ai file diversi dai seguenti file verranno rifiutate:**

-   `src/main/java/com/bytelegend/Main.java`
</details>
