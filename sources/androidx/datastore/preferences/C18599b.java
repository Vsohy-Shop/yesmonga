package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.datastore.preferences.b */
public final class C18599b {
    @C12579k

    /* renamed from: a */
    public static final C18600a f47456a = new C18600a((DefaultConstructorMarker) null);

    /* renamed from: androidx.datastore.preferences.b$a */
    public static final class C18600a {
        public /* synthetic */ C18600a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final PreferencesProto.C18590b mo53691a(@C12579k InputStream inputStream) {
            Intrinsics.checkNotNullParameter(inputStream, "input");
            try {
                PreferencesProto.C18590b q1 = PreferencesProto.C18590b.m84215q1(inputStream);
                Intrinsics.checkNotNullExpressionValue(q1, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return q1;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }

        public C18600a() {
        }
    }
}
