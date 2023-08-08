package androidx.compose.p004ui.text.intl;

import android.os.LocaleList;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.text.platform.C16399y;
import androidx.compose.p004ui.text.platform.C16400z;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(api = 24)
/* renamed from: androidx.compose.ui.text.intl.c */
public final class C16338c implements C16345h {
    @C12580l

    /* renamed from: a */
    public LocaleList f40565a;
    @C12580l

    /* renamed from: b */
    public C16342f f40566b;
    @C12579k

    /* renamed from: c */
    public final C16400z f40567c = C16399y.m73981a();

    @C12579k
    /* renamed from: a */
    public C16342f mo47352a() {
        LocaleList localeList = LocaleList.getDefault();
        Intrinsics.checkNotNullExpressionValue(localeList, "getDefault()");
        synchronized (this.f40567c) {
            C16342f fVar = this.f40566b;
            if (fVar != null && localeList == this.f40565a) {
                return fVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Locale locale = localeList.get(i);
                Intrinsics.checkNotNullExpressionValue(locale, "platformLocaleList[position]");
                arrayList.add(new C16340e((C16344g) new C16336a(locale)));
            }
            C16342f fVar2 = new C16342f((List<C16340e>) arrayList);
            this.f40565a = localeList;
            this.f40566b = fVar2;
            return fVar2;
        }
    }

    @C12579k
    /* renamed from: b */
    public C16344g mo47353b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        Intrinsics.checkNotNullExpressionValue(forLanguageTag, "forLanguageTag(languageTag)");
        return new C16336a(forLanguageTag);
    }
}
