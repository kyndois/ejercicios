package tareas.ahorcado

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import javax.sound.midi.MidiSystem
import javax.sound.midi.Sequencer


internal class ReproductorMidi(ficheroMidi: String) {
    //simplificamos el throws con Exception para hacer código limpio (aunque de peor calidad)
    // lo más fácil pillar el secuenciador por defecto.
    var sequencer: Sequencer = MidiSystem.getSequencer()

    init {
        //antes de usar el secuenciaador hay que abrirlo.
        sequencer.open()
        // la secuencia midi es un InputStream. Puede ser un fichero, un stream de internet, ...en este caso es un fichero
        val `is`: InputStream = BufferedInputStream(FileInputStream(File(ficheroMidi)))
        sequencer.setSequence(`is`)
        //cuando nos interesa arrancamos la reproducción.
        sequencer.start()
        //repetimos indefinidadmente la cancion indicando que se repita LOPP_CONTINUOSLY
        sequencer.loopCount = Sequencer.LOOP_CONTINUOUSLY
    }

    fun cerrar() {
        sequencer.close()
    }
}