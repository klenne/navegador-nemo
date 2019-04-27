
package br.com.nemo.navegadornemo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class LaunchScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Indica o layout a qual será inicializado nesta classe, no caso a tela que será a SplashScreen
        setContentView(R.layout.activity_launch_screen)
        Handler().postDelayed({
            //Inicializaremos a activity principal e finalizaremos a atual da splash após 2 segundos
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2000)

    }
}
