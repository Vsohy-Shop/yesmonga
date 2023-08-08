package androidx.compose.p004ui.text.platform.extensions;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.text.intl.C16340e;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.platform.C16383l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(24)
@C11363r0({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n1549#2:57\n1620#2,3:58\n37#3,2:55\n37#3,2:61\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n40#1:51\n40#1:52,3\n47#1:57\n47#1:58,3\n40#1:55,2\n47#1:61,2\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.extensions.b */
public final class C16371b {
    @C12579k

    /* renamed from: a */
    public static final C16371b f40632a = new C16371b();

    @C0376v0(24)
    @C12579k
    @C0373u
    /* renamed from: a */
    public final Object mo47539a(@C12579k C16342f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "localeList");
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(fVar, 10));
        Iterator it = fVar.iterator();
        while (it.hasNext()) {
            arrayList.add(C16370a.m73908a((C16340e) it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @C0376v0(24)
    @C0373u
    /* renamed from: b */
    public final void mo47540b(@C12579k C16383l lVar, @C12579k C16342f fVar) {
        Intrinsics.checkNotNullParameter(lVar, "textPaint");
        Intrinsics.checkNotNullParameter(fVar, "localeList");
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(fVar, 10));
        Iterator it = fVar.iterator();
        while (it.hasNext()) {
            arrayList.add(C16370a.m73908a((C16340e) it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        lVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
