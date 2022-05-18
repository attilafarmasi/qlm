# TV reklámok megjelenési gyakoriságának a számítása

* Adott N darab reklám. Minden reklámhoz tartozik egy maximális megjelenési szám, és egy
megjelenési súly. A maximális megjelenési szám (Mk) megadja, hogy a k-adik reklám D
napon belül csak hányszor jelenhet meg.

* A megjelenés súlya Sk megadja, hogy k-adik reklám a többi
reklámhoz képest milyen gyakran jelenjen meg. Sk ∈ [0..1]. Például, ha S1 = 0.1, S2 = 0.2,
akkor a 2-es reklám adott idő alatt 2x annyiszor jelenik meg, mint az 1-es reklám.

* A rendszeren belül az idő számítása napokban történik, amit egy időegyenesen ábrázolhatunk.
Minden egész szám egy napnak felel meg (dayIndex). Egy napon belül tetszőleges számú
reklám megjelenést lehet kérni.
Nagyságrendek: a reklámok és a napi megjelenések száma kevesebb, mint 1000

