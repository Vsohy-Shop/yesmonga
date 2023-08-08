package androidx.compose.p004ui.autofill;

import androidx.autofill.C0861a;
import androidx.compose.p004ui.C8761g;
import java.util.HashMap;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* renamed from: androidx.compose.ui.autofill.f */
public final class C8710f {
    @C12579k

    /* renamed from: a */
    public static final HashMap<AutofillType, String> f23393a = C10977s0.m41446M(C11078d1.m42659a(AutofillType.EmailAddress, C0861a.f2701a), C11078d1.m42659a(AutofillType.Username, "username"), C11078d1.m42659a(AutofillType.Password, "password"), C11078d1.m42659a(AutofillType.NewUsername, C0861a.f2693E), C11078d1.m42659a(AutofillType.NewPassword, C0861a.f2694F), C11078d1.m42659a(AutofillType.PostalAddress, C0861a.f2706f), C11078d1.m42659a(AutofillType.PostalCode, C0861a.f2707g), C11078d1.m42659a(AutofillType.CreditCardNumber, C0861a.f2708h), C11078d1.m42659a(AutofillType.CreditCardSecurityCode, C0861a.f2709i), C11078d1.m42659a(AutofillType.CreditCardExpirationDate, C0861a.f2710j), C11078d1.m42659a(AutofillType.CreditCardExpirationMonth, C0861a.f2711k), C11078d1.m42659a(AutofillType.CreditCardExpirationYear, C0861a.f2712l), C11078d1.m42659a(AutofillType.CreditCardExpirationDay, C0861a.f2713m), C11078d1.m42659a(AutofillType.AddressCountry, C0861a.f2714n), C11078d1.m42659a(AutofillType.AddressRegion, C0861a.f2715o), C11078d1.m42659a(AutofillType.AddressLocality, C0861a.f2716p), C11078d1.m42659a(AutofillType.AddressStreet, C0861a.f2717q), C11078d1.m42659a(AutofillType.AddressAuxiliaryDetails, C0861a.f2718r), C11078d1.m42659a(AutofillType.PostalCodeExtended, C0861a.f2719s), C11078d1.m42659a(AutofillType.PersonFullName, C0861a.f2720t), C11078d1.m42659a(AutofillType.PersonFirstName, C0861a.f2721u), C11078d1.m42659a(AutofillType.PersonLastName, C0861a.f2722v), C11078d1.m42659a(AutofillType.PersonMiddleName, C0861a.f2723w), C11078d1.m42659a(AutofillType.PersonMiddleInitial, C0861a.f2724x), C11078d1.m42659a(AutofillType.PersonNamePrefix, C0861a.f2725y), C11078d1.m42659a(AutofillType.PersonNameSuffix, C0861a.f2726z), C11078d1.m42659a(AutofillType.PhoneNumber, C0861a.f2689A), C11078d1.m42659a(AutofillType.PhoneNumberDevice, C0861a.f2690B), C11078d1.m42659a(AutofillType.PhoneCountryCode, C0861a.f2691C), C11078d1.m42659a(AutofillType.PhoneNumberNational, C0861a.f2692D), C11078d1.m42659a(AutofillType.Gender, "gender"), C11078d1.m42659a(AutofillType.BirthDateFull, C0861a.f2696H), C11078d1.m42659a(AutofillType.BirthDateDay, C0861a.f2697I), C11078d1.m42659a(AutofillType.BirthDateMonth, C0861a.f2698J), C11078d1.m42659a(AutofillType.BirthDateYear, C0861a.f2699K), C11078d1.m42659a(AutofillType.SmsOtpCode, C0861a.f2700L));

    @C8761g
    /* renamed from: a */
    public static /* synthetic */ void m32322a() {
    }

    @C12579k
    /* renamed from: b */
    public static final String m32323b(@C12579k AutofillType autofillType) {
        Intrinsics.checkNotNullParameter(autofillType, "<this>");
        String str = f23393a.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }

    @C8761g
    /* renamed from: c */
    public static /* synthetic */ void m32324c(AutofillType autofillType) {
    }
}
