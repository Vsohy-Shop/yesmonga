package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.C18602a;
import com.bumptech.glide.load.engine.GlideException;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, mo22516d2 = {"", "Landroidx/datastore/preferences/core/a$a;", "", "entry", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class MutablePreferences$toString$1 extends Lambda implements C11300l<Map.Entry<C18602a.C18603a<?>, Object>, CharSequence> {

    /* renamed from: f */
    public static final MutablePreferences$toString$1 f47459f = new MutablePreferences$toString$1();

    public MutablePreferences$toString$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k Map.Entry<C18602a.C18603a<?>, Object> entry) {
        Intrinsics.checkNotNullParameter(entry, C33541p.f81644a);
        return GlideException.C22148a.f56917d + entry.getKey().mo53719a() + " = " + entry.getValue();
    }
}
