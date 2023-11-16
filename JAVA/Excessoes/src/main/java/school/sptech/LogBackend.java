package school.sptech;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.Configurator;

import java.util.TimerTask;

public class LogBackend {

        private static Logger log = LogManager.getLogger(LogBackend.class);

    public static void main(String[] args) {

        Configurator.setRootLevel(Level.ALL);

        log.info("Programa iniciado");
        log.error("Deu ruim: (");
        log.warn("Você foi avisado");

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

            }
        };
        
    }

}
