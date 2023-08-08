package androidx.constraintlayout.core.parser;

import com.carrefour.fid.android.core.extension.C36306e;

public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String str, C16735c cVar) {
        this.mReason = str;
        if (cVar != null) {
            this.mElementClass = cVar.mo49169H();
            this.mLineNumber = cVar.mo49184y();
            return;
        }
        this.mElementClass = "unknown";
        this.mLineNumber = 0;
    }

    /* renamed from: a */
    public String mo49131a() {
        return this.mReason + C36306e.f89637a + this.mElementClass + " at line " + this.mLineNumber + ")";
    }

    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + mo49131a();
    }
}
