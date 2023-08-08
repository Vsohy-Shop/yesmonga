package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.n */
public final class C12388n {
    @C12579k
    /* renamed from: a */
    public static final JsonDecodingException m50102a(@C12579k Number number, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(number, "value");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "output");
        return m50106e(-1, m50112k(number, str, str2));
    }

    @C12579k
    /* renamed from: b */
    public static final JsonEncodingException m50103b(@C12579k Number number, @C12579k String str) {
        Intrinsics.checkNotNullParameter(number, "value");
        Intrinsics.checkNotNullParameter(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + m50110i(str, 0, 1, (Object) null));
    }

    @C12579k
    /* renamed from: c */
    public static final JsonEncodingException m50104c(@C12579k Number number, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(number, "value");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "output");
        return new JsonEncodingException(m50112k(number, str, str2));
    }

    @C12579k
    /* renamed from: d */
    public static final JsonEncodingException m50105d(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + fVar.mo24830h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fVar.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @C12579k
    /* renamed from: e */
    public static final JsonDecodingException m50106e(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    @C12579k
    /* renamed from: f */
    public static final JsonDecodingException m50107f(int i, @C12579k String str, @C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(charSequence, "input");
        return m50106e(i, str + "\nJSON input: " + m50109h(charSequence, i));
    }

    @C12579k
    /* renamed from: g */
    public static final JsonDecodingException m50108g(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "input");
        return m50106e(-1, "Encountered unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + m50110i(str2, 0, 1, (Object) null));
    }

    /* renamed from: h */
    public static final CharSequence m50109h(CharSequence charSequence, int i) {
        String str;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return Intrinsics.stringPlus(str2, charSequence.subSequence(length, charSequence.length()).toString());
        }
        int i2 = i - 30;
        int i3 = i + 30;
        if (i2 <= 0) {
            str = "";
        } else {
            str = str2;
        }
        if (i3 >= charSequence.length()) {
            str2 = "";
        }
        return str + charSequence.subSequence(C11479u.m44447u(i2, 0), C11479u.m44313B(i3, charSequence.length())).toString() + str2;
    }

    /* renamed from: i */
    public static /* synthetic */ CharSequence m50110i(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return m50109h(charSequence, i);
    }

    @C12579k
    /* renamed from: j */
    public static final Void m50111j(@C12579k C12359a aVar, @C12579k Number number) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(number, "result");
        C12359a.m49866x(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: k */
    public static final String m50112k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + m50110i(str2, 0, 1, (Object) null);
    }
}
