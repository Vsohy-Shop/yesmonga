package kotlinx.serialization.json;

import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.C12361b;
import kotlinx.serialization.json.internal.C12382k0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"", "", "Lkotlinx/serialization/json/k;", "<name for destructuring parameter 0>", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class JsonObject$toString$1 extends Lambda implements C11300l<Map.Entry<? extends String, ? extends C12403k>, CharSequence> {

    /* renamed from: f */
    public static final JsonObject$toString$1 f30173f = new JsonObject$toString$1();

    public JsonObject$toString$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k Map.Entry<String, ? extends C12403k> entry) {
        Intrinsics.checkNotNullParameter(entry, "$dstr$k$v");
        StringBuilder sb = new StringBuilder();
        C12382k0.m50085e(sb, entry.getKey());
        sb.append(C12361b.f30257h);
        sb.append((C12403k) entry.getValue());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
