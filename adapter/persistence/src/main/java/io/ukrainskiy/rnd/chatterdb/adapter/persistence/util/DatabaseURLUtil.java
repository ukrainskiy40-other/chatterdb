package io.ukrainskiy.rnd.chatterdb.adapter.persistence.util;

import lombok.experimental.UtilityClass;
import org.apache.logging.log4j.util.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UtilityClass
public class DatabaseURLUtil {

    /**
     * Метод позволяющий в строке подключения к бд (ex: r2dbc:postgresql://hostname:5432/db_name?schema=schemaName )
     * Заменить r2dbc на jdbc. Необходимо для Liquibase
     *
     * @param r2dbcUrl строка с r2dbc подключением
     * @return строка с jdbc подключением
     */

    public static String replaceR2dbcToJdbc(String r2dbcUrl) {
        return r2dbcUrl.replace("r2dbc:", "jdbc:");
    }


    /**
     * Метод позволяющий в строке подключения к бд (ex: r2dbc:postgresql://hostname:5432/db_name?schema=schemaName )
     * Получить имя схемы. Необходимо для Liquibase
     *
     * @param url строка с подключением к бд
     * @return имя схемы
     */
    public static String getSchemaFromUrl(String url) {
        Pattern pattern = Pattern.compile("\\?schema=(\\w+)");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            return matcher.group(1);
        }

        return Strings.EMPTY;
    }
}
