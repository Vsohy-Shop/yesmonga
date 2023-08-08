package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p010io.FilesKt__UtilsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Ljava/io/File;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PreferenceDataStoreFactory$create$delegate$1 extends Lambda implements C11289a<File> {
    final /* synthetic */ C11289a<File> $produceFile;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$create$delegate$1(C11289a<? extends File> aVar) {
        super(0);
        this.$produceFile = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final File invoke() {
        File invoke = this.$produceFile.invoke();
        String Y = FilesKt__UtilsKt.m42886Y(invoke);
        C18607d dVar = C18607d.f47465a;
        if (Intrinsics.areEqual((Object) Y, (Object) dVar.mo53728e())) {
            return invoke;
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + dVar.mo53728e()).toString());
    }
}
