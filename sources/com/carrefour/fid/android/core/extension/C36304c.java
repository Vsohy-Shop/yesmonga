package com.carrefour.fid.android.core.extension;

import com.carrefour.fid.android.core.type.FreshnessType;
import com.carrefour.fid.android.data.entities.Offer;
import com.carrefour.fid.android.domain.models.FreshnessGuaranteeDomain;
import com.carrefour.fid.android.domain.models.InvalidFreshnessGuaranteeDomain;
import com.carrefour.fid.android.domain.models.ValidFreshnessGuaranteeDomain;
import com.carrefour.fid.android.shared.constant.C28561l1;
import com.contentsquare.android.api.C14092c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.core.extension.c */
public final class C36304c {
    @C12579k
    /* renamed from: a */
    public static final FreshnessGuaranteeDomain m148947a(@C12579k Offer offer) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Integer freshnessGuarantee = offer.getFreshnessGuarantee();
        boolean z15 = true;
        if (freshnessGuarantee != null && freshnessGuarantee.intValue() == 1) {
            return new ValidFreshnessGuaranteeDomain(offer.getFreshnessGuarantee().toString(), FreshnessType.DAY);
        }
        C11466l lVar = new C11466l(1, 15);
        if (freshnessGuarantee == null || !lVar.mo23056Q(freshnessGuarantee.intValue())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new ValidFreshnessGuaranteeDomain(String.valueOf(offer.getFreshnessGuarantee()), FreshnessType.DAYS);
        }
        C11466l lVar2 = new C11466l(16, 20);
        if (freshnessGuarantee == null || !lVar2.mo23056Q(freshnessGuarantee.intValue())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return new ValidFreshnessGuaranteeDomain("15", FreshnessType.DAYS);
        }
        C11466l lVar3 = new C11466l(21, 30);
        if (freshnessGuarantee == null || !lVar3.mo23056Q(freshnessGuarantee.intValue())) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            return new ValidFreshnessGuaranteeDomain("3", FreshnessType.WEEKS);
        }
        C11466l lVar4 = new C11466l(31, 61);
        if (freshnessGuarantee == null || !lVar4.mo23056Q(freshnessGuarantee.intValue())) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            return new ValidFreshnessGuaranteeDomain("1", FreshnessType.MONTHS);
        }
        C11466l lVar5 = new C11466l(62, 92);
        if (freshnessGuarantee == null || !lVar5.mo23056Q(freshnessGuarantee.intValue())) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            return new ValidFreshnessGuaranteeDomain("2", FreshnessType.MONTHS);
        }
        C11466l lVar6 = new C11466l(93, 123);
        if (freshnessGuarantee == null || !lVar6.mo23056Q(freshnessGuarantee.intValue())) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            return new ValidFreshnessGuaranteeDomain("3", FreshnessType.MONTHS);
        }
        C11466l lVar7 = new C11466l(124, 153);
        if (freshnessGuarantee == null || !lVar7.mo23056Q(freshnessGuarantee.intValue())) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7) {
            return new ValidFreshnessGuaranteeDomain("4", FreshnessType.MONTHS);
        }
        C11466l lVar8 = new C11466l(154, 184);
        if (freshnessGuarantee == null || !lVar8.mo23056Q(freshnessGuarantee.intValue())) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            return new ValidFreshnessGuaranteeDomain("5", FreshnessType.MONTHS);
        }
        C11466l lVar9 = new C11466l(185, C14092c.f34579a0);
        if (freshnessGuarantee == null || !lVar9.mo23056Q(freshnessGuarantee.intValue())) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            return new ValidFreshnessGuaranteeDomain("6", FreshnessType.MONTHS);
        }
        C11466l lVar10 = new C11466l(ModuleDescriptor.MODULE_VERSION, 245);
        if (freshnessGuarantee == null || !lVar10.mo23056Q(freshnessGuarantee.intValue())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return new ValidFreshnessGuaranteeDomain("7", FreshnessType.MONTHS);
        }
        C11466l lVar11 = new C11466l(246, 275);
        if (freshnessGuarantee == null || !lVar11.mo23056Q(freshnessGuarantee.intValue())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return new ValidFreshnessGuaranteeDomain("8", FreshnessType.MONTHS);
        }
        C11466l lVar12 = new C11466l(276, 306);
        if (freshnessGuarantee == null || !lVar12.mo23056Q(freshnessGuarantee.intValue())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            return new ValidFreshnessGuaranteeDomain("9", FreshnessType.MONTHS);
        }
        C11466l lVar13 = new C11466l(307, 336);
        if (freshnessGuarantee == null || !lVar13.mo23056Q(freshnessGuarantee.intValue())) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            return new ValidFreshnessGuaranteeDomain(C28561l1.f69523p, FreshnessType.MONTHS);
        }
        C11466l lVar14 = new C11466l(337, C14092c.f34675y0);
        if (freshnessGuarantee == null || !lVar14.mo23056Q(freshnessGuarantee.intValue())) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            return new ValidFreshnessGuaranteeDomain("11", FreshnessType.MONTHS);
        }
        C11466l lVar15 = new C11466l(365, Integer.MAX_VALUE);
        if (freshnessGuarantee == null || !lVar15.mo23056Q(freshnessGuarantee.intValue())) {
            z15 = false;
        }
        if (z15) {
            return new ValidFreshnessGuaranteeDomain("1", FreshnessType.YEAR);
        }
        return InvalidFreshnessGuaranteeDomain.f95166b;
    }
}
