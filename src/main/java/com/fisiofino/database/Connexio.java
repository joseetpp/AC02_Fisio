package com.fisiofino.database;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**** AQUESTA CLASSE DEFINEIX LA CONNEXIÓ I EL DATASOURCE */

public class Connexio {

    private static HikariDataSource dataSource;
    /**
     * Inicia el pool de connexions amb el fitxer de configuració EXTERN (fora del jar).
     *
     * @param connPropertiesPath ruta del fitxer conn.properties (absoluta o relativa al directori de
     *                           treball). Conté DB_URL, DB_USER, DB_PASSWORD i DB_MAX_POOL; com que
     *                           inclou la contrasenya, no s'ha de pujar al repositori.
     */
    public static void iniciaConnexio(String connPropertiesPath) throws IOException {
        /************* HAS DE COMPLETAR EL CODI ******************/
        //Si ya hubiera un pool abierto (p. ej. entre suites de tests), ciérralo antes
        if (dataSource != null && !dataSource.isClosed()) {
            dataSource.close();
        }
        //Carga las propiedades desde el fichero externo
        Properties props = new Properties();
        try (InputStream is = Files.newInputStream(Path.of(connPropertiesPath))) {
            props.load(is);
        } 
        //Configuramos HikariConfig con DB_URL, DB_USER, DB_PASSWORD y DB_MAX_POOL
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(props.getProperty("DB_URL"));
        config.setUsername(props.getProperty("DB_USER"));
        config.setPassword(props.getProperty("DB_PASSWORD"));
        config.setMaximumPoolSize(Integer.parseInt(props.getProperty("DB_MAX_POOL")));
        // Crea el pool de conexiones activo
        dataSource = new HikariDataSource();
    }
    public static Connection gConnection() throws SQLException{
        if(dataSource == null || dataSource.isClosed()){
            throw new SQLException();
        }
        return dataSource.getConnection();
    }

    public static void tancaConnexio() {
        /************* HAS DE COMPLETAR EL CODI ******************/
        if (dataSource != null && !dataSource.isClosed()) {
            dataSource.close();
        }
    }

}
