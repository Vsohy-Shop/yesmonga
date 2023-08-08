package com.usabilla.sdk.ubform.sdk.form;

import android.content.Intent;
import com.usabilla.sdk.ubform.C9771d;
import com.usabilla.sdk.ubform.sdk.entity.FeedbackResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.form.c */
public final class C10050c {
    @C12579k

    /* renamed from: a */
    public static final C10051a f27644a = new C10051a((DefaultConstructorMarker) null);

    /* renamed from: com.usabilla.sdk.ubform.sdk.form.c$a */
    public static final class C10051a {

        /* renamed from: com.usabilla.sdk.ubform.sdk.form.c$a$a */
        public /* synthetic */ class C10052a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FormType.values().length];
                iArr[FormType.PASSIVE_FEEDBACK.ordinal()] = 1;
                iArr[FormType.CAMPAIGN.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C10051a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final Intent mo21171a(@C12579k FormType formType, @C12580l FeedbackResult feedbackResult) {
            Intrinsics.checkNotNullParameter(formType, "formType");
            int i = C10052a.$EnumSwitchMapping$0[formType.ordinal()];
            if (i == 1) {
                Intent intent = new Intent(C9771d.f26774b);
                intent.putExtra(FeedbackResult.f27417e, feedbackResult);
                return intent;
            } else if (i == 2) {
                Intent intent2 = new Intent(C9771d.f26775c);
                intent2.putExtra(FeedbackResult.f27418f, feedbackResult);
                return intent2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        public C10051a() {
        }
    }

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final Intent m37976a(@C12579k FormType formType, @C12580l FeedbackResult feedbackResult) {
        return f27644a.mo21171a(formType, feedbackResult);
    }
}
