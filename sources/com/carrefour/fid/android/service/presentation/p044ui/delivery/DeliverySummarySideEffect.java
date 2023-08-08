package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummarySideEffect;", "", "ValidationError", "ValidationSuccess", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummarySideEffect$ValidationError;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummarySideEffect$ValidationSuccess;", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummarySideEffect */
public interface DeliverySummarySideEffect {

    @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummarySideEffect$ValidationError;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummarySideEffect;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummarySideEffect$ValidationError */
    public static final class ValidationError implements DeliverySummarySideEffect {
        public static final int $stable = 8;
        @C12579k
        private final Throwable throwable;

        public ValidationError(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.throwable = th;
        }

        public static /* synthetic */ ValidationError copy$default(ValidationError validationError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = validationError.throwable;
            }
            return validationError.copy(th);
        }

        @C12579k
        public final Throwable component1() {
            return this.throwable;
        }

        @C12579k
        public final ValidationError copy(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            return new ValidationError(th);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValidationError) && Intrinsics.areEqual((Object) this.throwable, (Object) ((ValidationError) obj).throwable);
        }

        @C12579k
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.throwable;
            return "ValidationError(throwable=" + th + ")";
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummarySideEffect$ValidationSuccess;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummarySideEffect;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummarySideEffect$ValidationSuccess */
    public static final class ValidationSuccess implements DeliverySummarySideEffect {
        public static final int $stable = 0;
        @C12579k
        public static final ValidationSuccess INSTANCE = new ValidationSuccess();

        private ValidationSuccess() {
        }
    }
}
