package unity;

import com.squareup.moshi.C35382f;
import com.squareup.moshi.C35430u;
import kotlin.C11076d0;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, mo22516d2 = {"Lunity/ForceToBooleanAdapter;", "", "()V", "fromJson", "", "string", "", "toJson", "bool", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class ForceToBooleanAdapter {
    @C35382f
    @ForceToBoolean
    public final boolean fromJson(@C12580l String str) {
        if (str == null) {
            return false;
        }
        return !C11622t.isBlank(str);
    }

    @C35430u
    @C12579k
    public final String toJson(@ForceToBoolean boolean z) {
        return String.valueOf(z);
    }
}
