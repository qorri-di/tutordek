package id.contools.common.generate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class autoGen {

    public String genId(){
        TimeZone jakartaTimeZone = TimeZone.getTimeZone("Asia/Jakarta");
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyySSSS");
        dateFormat.setTimeZone(jakartaTimeZone);
        return dateFormat.format(new Date());
    }
}
