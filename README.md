# Material Blue-grey Themes
10 Temas Blue-grey basados en Material Design.

# Instalación
**Plataforma: Android Studio 3.4.2**

1. Clic derecho sobre el proyecto > New > Module > Import .JAR/ .ARR Package 
2. Seleccionar la librería ydar en Finish.
3. Añadir lo siguiente en build.gradle(Module:app).
```gradle
dependencies {
    ...   
    implementation project(':libmaterialhycb-release')    
    ...
}
```
4. Sincronizar Gradle dando en 'Sync now'.

# Uso
1. Ir al archivo AndroidManifest.xml y cambiar el tema al requerido.
```xml
<application
        ...
        android:theme="@style/AppTheme.MaterialBGxxxxx">
    <activity ...>
      ...
    </activity>
</application>
```
