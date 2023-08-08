package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import java.io.File;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, mo22516d2 = {"T", "Ljava/io/File;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SingleProcessDataStore$file$2 extends Lambda implements C11289a<File> {
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$file$2(SingleProcessDataStore<T> singleProcessDataStore) {
        super(0);
        this.this$0 = singleProcessDataStore;
    }

    @C12579k
    /* renamed from: a */
    public final File invoke() {
        File file = (File) this.this$0.f47397a.invoke();
        String absolutePath = file.getAbsolutePath();
        SingleProcessDataStore.C18559a aVar = SingleProcessDataStore.f47394k;
        synchronized (aVar.mo53556b()) {
            if (!aVar.mo53555a().contains(absolutePath)) {
                Set<String> a = aVar.mo53555a();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "it");
                a.add(absolutePath);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return file;
    }
}
