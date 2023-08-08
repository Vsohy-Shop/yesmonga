package okhttp3.internal.http;

import com.android.volley.toolbox.C21812m;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.C11076d0;
import okhttp3.internal.Util;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, mo22516d2 = {"okhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "initialValue", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class DatesKt$STANDARD_DATE_FORMAT$1 extends ThreadLocal<DateFormat> {
    @C12579k
    public DateFormat initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C21812m.f56431d, Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(Util.UTC);
        return simpleDateFormat;
    }
}
