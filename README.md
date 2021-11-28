# Examples
Для каждого блока задач(например DI или Android API) создаем свой пэкэдж внутри sources(ВАЖНО), в котором создаем модули для задач.
(в студии лучше переключить просмотр файлов на режим Project).<br />
<p align="center">
   <img src="https://github.com/Giksengik/Examples/blob/master/guide/img.png?rawType=true)"/>  
</p>
<br/>
При создании модуля не надо добавлять дополнительный include в settings.gradle.
Модуль создаем как удобно, стараемся не оставлять файлы которые не понадобятся (androidTest и test пэкэджи в большинстве случаев можно удалить). </br></br>
В build.gradle модуля добавляем зависимости через общий файл с зависимостями, он располагается тут: gradle/versions/commonLibs
(лучше перед написанием 
<a href="https://clover-jujube-0c6.notion.site/Gradle-acba0cf1af584317ae29c843ecdd1c62">изучить это</a> )</br></br>
Модуль можно задавать через функции
<a href="https://clover-jujube-0c6.notion.site/f996307b9fba42eba8be62738fd58f04">об этом можно почитать тут</a>
Сейчас имеется 3 функции для создания модулей: </br>
start-point-module - для задания точки входа для андроид приложения </br>
android-module - для стандартного android модуля  </br>
di-module - для стандрартного dagge модуля </br>
Функции по созданию модулей прописаны в build.gradle проекта. </br>
