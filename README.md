# نمونه کد ثبت نام با زبان کاتلین
![ثبت نام در کاتلین ](https://raw.githubusercontent.com/mirakabzi/register-with-kotlin/main/168887902-0c1cc9e8-7ab5-48e0-96d0-a26ce9d167ba.jpeg "کاتلین ثبت نام") 

### این کد یک فرم ثبت نام ساده با دو فیلد ایجاد می‌کند: نام کاربری و رمز عبور. دکمه registerButton هنگامی که کاربر روی دکمه "ثبت نام" کلیک می‌کند، کلیک می‌شود. اگر فیلدهای نام کاربری یا رمز عبور خالی باشند، یک پیام خطا نمایش داده خواهد شد.
--
در این کد، یک کلاس RegisterActivity ایجاد شده است که در آن کد مربوط به مدیریت فرم ثبت نام قرار دارد. این کلاس از کلاس AppCompatActivity ارث می‌برد، این بدان معناست که این کلاس ویژگی‌های مشترک تمام فعالیت‌های Android را به ارث می‌برد.

متد onCreate() این کلاس، که هنگام ایجاد فعالیت فراخوانی می‌شود، مسئول ایجاد رابط کاربری فرم ثبت نام است. این متد کد زیر را شامل می‌شود:
``` 
setContentView(R.layout.activity_register)
```

این کد رابط کاربری فرم ثبت نام را از فایل activity_register.xml بارگذاری می‌کند.

کد زیر دکمه registerButton را به یک شنونده رویداد متصل می‌کند که هنگام کلیک بر روی دکمه اجرا می‌شود:

```
registerButton.setOnClickListener {
```

این listener رویداد شامل کد زیر است:
```
if (usernameEditText.text.toString().isEmpty()) {
    usernameEditText.error = "Please enter your username"
} else if (passwordEditText.text.toString().isEmpty()) {
    passwordEditText.error = "Please enter your password"
} else {
    //TODO: Create a user account
    val intent = Intent(this, LoginActivity::class.java)
    startActivity(intent)
}
 ```

این کد ابتدا بررسی می‌کند که آیا فیلدهای نام کاربری یا رمز عبور خالی هستند. اگر یکی از این فیلدها خالی باشد، یک پیام خطا به کاربر نمایش داده می‌شود. در غیر این صورت، کد زیر اجرا می‌شود:
```
//TODO: Create a user account
```

این کد هنوز اجرا نمی‌شود، بلکه باید در آینده تکمیل شود تا یک حساب کاربری جدید ایجاد شود.

کد زیر حساب کاربری جدید را ایجاد می‌کند و کاربر را به صفحه ورود منتقل می‌کند:
```
val intent = Intent(this, LoginActivity::class.java)
startActivity(intent)
```

این کد یک شیء Intent ایجاد می‌کند که به فعالیت LoginActivity اشاره می‌کند و سپس فعالیت جاری را با استفاده از این شیء متوقف می‌کند. در نتیجه، کاربر به صفحه ورود منتقل می‌شود.

[دوره ی آموزش کامل کاتلین ](https://avasam.ir/product/48/Kotlin-full-course-by-sam-nikzad)
