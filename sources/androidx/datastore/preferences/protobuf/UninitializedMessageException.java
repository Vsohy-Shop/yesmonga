package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public UninitializedMessageException(C18920z1 z1Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    /* renamed from: b */
    public static String m85187b(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public InvalidProtocolBufferException mo54135a() {
        return new InvalidProtocolBufferException(getMessage());
    }

    /* renamed from: c */
    public List<String> mo54136c() {
        return Collections.unmodifiableList(this.missingFields);
    }

    public UninitializedMessageException(List<String> list) {
        super(m85187b(list));
        this.missingFields = list;
    }
}
