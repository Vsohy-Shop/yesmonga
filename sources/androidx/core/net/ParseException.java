package androidx.core.net;

import androidx.annotation.C0359n0;

public class ParseException extends RuntimeException {
    @C0359n0
    public final String response;

    public ParseException(@C0359n0 String str) {
        super(str);
        this.response = str;
    }
}
