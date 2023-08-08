package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.runtime.C8698y1;
import com.urbanairship.util.C9647e0;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12311t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bª\u0001\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 ÷\u00012\u00020\u0001:\bø\u0001ù\u0001ú\u0001÷\u0001BÛ\u0004\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010!\u0012\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010E\u0012\n\b\u0002\u0010z\u001a\u0004\u0018\u00010G\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010I¢\u0006\u0006\bð\u0001\u0010ñ\u0001Bû\u0004\b\u0017\u0012\u0007\u0010ò\u0001\u001a\u00020\u0011\u0012\u0007\u0010ó\u0001\u001a\u00020\u0011\u0012\n\b\u0001\u0010K\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010L\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010N\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010P\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010Q\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010S\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010U\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010V\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010W\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010X\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010Z\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0001\u0010[\u001a\u0004\u0018\u00010!\u0012\u0010\b\u0001\u0010\\\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#\u0012\n\b\u0001\u0010]\u001a\u0004\u0018\u00010%\u0012\n\b\u0001\u0010^\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010_\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010`\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010f\u001a\u0004\u0018\u000101\u0012\n\b\u0001\u0010g\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010h\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010i\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010j\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010k\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010l\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010m\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010n\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010o\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010p\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010r\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010s\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010t\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010u\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010v\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010w\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010x\u001a\u0004\u0018\u00010(\u0012\n\b\u0001\u0010y\u001a\u0004\u0018\u00010E\u0012\n\b\u0001\u0010z\u001a\u0004\u0018\u00010G\u0012\n\b\u0001\u0010{\u001a\u0004\u0018\u00010I\u0012\n\u0010õ\u0001\u001a\u0005\u0018\u00010ô\u0001¢\u0006\u0006\bð\u0001\u0010ö\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010)\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b+\u0010*J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u000101HÆ\u0003J\u0012\u00103\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b3\u0010*J\u0012\u00104\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b4\u0010*J\u0012\u00105\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b5\u0010*J\u0012\u00106\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b6\u0010*J\u0012\u00107\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b7\u0010*J\u0012\u00108\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b8\u0010*J\u0012\u00109\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b9\u0010*J\u0012\u0010:\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b:\u0010*J\u0012\u0010;\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b;\u0010*J\u0012\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b<\u0010\u0013J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010>\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b>\u0010*J\u0012\u0010?\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b?\u0010*J\u0012\u0010@\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b@\u0010*J\u0012\u0010A\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bA\u0010*J\u0012\u0010B\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bB\u0010*J\u0012\u0010C\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bC\u0010*J\u0012\u0010D\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bD\u0010*J\u000b\u0010F\u001a\u0004\u0018\u00010EHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010GHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010IHÆ\u0003Jâ\u0004\u0010|\u001a\u00020\u00002\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010f\u001a\u0004\u0018\u0001012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010u\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010IHÆ\u0001¢\u0006\u0004\b|\u0010}J\t\u0010~\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u00020\u0011HÖ\u0001J\u0015\u0010\u0001\u001a\u00020(2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003R'\u0010K\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bK\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R'\u0010L\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bL\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R'\u0010M\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bM\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R'\u0010N\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bN\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R'\u0010O\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bO\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R'\u0010P\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0017\n\u0005\bP\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R&\u0010Q\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0016\n\u0005\bQ\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010\u0013R&\u0010R\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0016\n\u0005\bR\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010\u0013R&\u0010S\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0016\n\u0005\bS\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010\u0013R'\u0010T\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bT\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R'\u0010U\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bU\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R&\u0010V\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0016\n\u0005\bV\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010\u0013R'\u0010W\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bW\u0010\u0001\u0012\u0006\b¡\u0001\u0010\u0001\u001a\u0006\b \u0001\u0010\u0001R&\u0010X\u001a\u0004\u0018\u00010\u001a8\u0006X\u0004¢\u0006\u0016\n\u0005\bX\u0010¢\u0001\u0012\u0006\b¤\u0001\u0010\u0001\u001a\u0005\b£\u0001\u0010\u001cR'\u0010Y\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\u0017\n\u0005\bY\u0010¥\u0001\u0012\u0006\b¨\u0001\u0010\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R'\u0010Z\u001a\u0004\u0018\u00010\u001f8\u0006X\u0004¢\u0006\u0017\n\u0005\bZ\u0010©\u0001\u0012\u0006\b¬\u0001\u0010\u0001\u001a\u0006\bª\u0001\u0010«\u0001R'\u0010[\u001a\u0004\u0018\u00010!8\u0006X\u0004¢\u0006\u0017\n\u0005\b[\u0010­\u0001\u0012\u0006\b°\u0001\u0010\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R-\u0010\\\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#8\u0006X\u0004¢\u0006\u0017\n\u0005\b\\\u0010±\u0001\u0012\u0006\b´\u0001\u0010\u0001\u001a\u0006\b²\u0001\u0010³\u0001R'\u0010]\u001a\u0004\u0018\u00010%8\u0006X\u0004¢\u0006\u0017\n\u0005\b]\u0010µ\u0001\u0012\u0006\b¸\u0001\u0010\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R'\u0010^\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\b^\u0010\u0001\u0012\u0006\bº\u0001\u0010\u0001\u001a\u0006\b¹\u0001\u0010\u0001R%\u0010_\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\b_\u0010»\u0001\u0012\u0006\b¼\u0001\u0010\u0001\u001a\u0004\b_\u0010*R%\u0010`\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\b`\u0010»\u0001\u0012\u0006\b½\u0001\u0010\u0001\u001a\u0004\b`\u0010*R'\u0010a\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\ba\u0010\u0001\u0012\u0006\b¿\u0001\u0010\u0001\u001a\u0006\b¾\u0001\u0010\u0001R'\u0010b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bb\u0010\u0001\u0012\u0006\bÁ\u0001\u0010\u0001\u001a\u0006\bÀ\u0001\u0010\u0001R'\u0010c\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bc\u0010\u0001\u0012\u0006\bÃ\u0001\u0010\u0001\u001a\u0006\bÂ\u0001\u0010\u0001R'\u0010d\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bd\u0010\u0001\u0012\u0006\bÅ\u0001\u0010\u0001\u001a\u0006\bÄ\u0001\u0010\u0001R'\u0010e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\be\u0010\u0001\u0012\u0006\bÇ\u0001\u0010\u0001\u001a\u0006\bÆ\u0001\u0010\u0001R'\u0010f\u001a\u0004\u0018\u0001018\u0006X\u0004¢\u0006\u0017\n\u0005\bf\u0010È\u0001\u0012\u0006\bË\u0001\u0010\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R%\u0010g\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bg\u0010»\u0001\u0012\u0006\bÌ\u0001\u0010\u0001\u001a\u0004\bg\u0010*R%\u0010h\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bh\u0010»\u0001\u0012\u0006\bÍ\u0001\u0010\u0001\u001a\u0004\bh\u0010*R%\u0010i\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bi\u0010»\u0001\u0012\u0006\bÎ\u0001\u0010\u0001\u001a\u0004\bi\u0010*R%\u0010j\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bj\u0010»\u0001\u0012\u0006\bÏ\u0001\u0010\u0001\u001a\u0004\bj\u0010*R%\u0010k\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bk\u0010»\u0001\u0012\u0006\bÐ\u0001\u0010\u0001\u001a\u0004\bk\u0010*R%\u0010l\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bl\u0010»\u0001\u0012\u0006\bÑ\u0001\u0010\u0001\u001a\u0004\bl\u0010*R&\u0010m\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0016\n\u0005\bm\u0010»\u0001\u0012\u0006\bÓ\u0001\u0010\u0001\u001a\u0005\bÒ\u0001\u0010*R&\u0010n\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0016\n\u0005\bn\u0010»\u0001\u0012\u0006\bÕ\u0001\u0010\u0001\u001a\u0005\bÔ\u0001\u0010*R&\u0010o\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0016\n\u0005\bo\u0010»\u0001\u0012\u0006\b×\u0001\u0010\u0001\u001a\u0005\bÖ\u0001\u0010*R&\u0010p\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0016\n\u0005\bp\u0010\u0001\u0012\u0006\bÙ\u0001\u0010\u0001\u001a\u0005\bØ\u0001\u0010\u0013R'\u0010q\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0017\n\u0005\bq\u0010\u0001\u0012\u0006\bÛ\u0001\u0010\u0001\u001a\u0006\bÚ\u0001\u0010\u0001R%\u0010r\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\br\u0010»\u0001\u0012\u0006\bÜ\u0001\u0010\u0001\u001a\u0004\br\u0010*R&\u0010s\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0016\n\u0005\bs\u0010»\u0001\u0012\u0006\bÞ\u0001\u0010\u0001\u001a\u0005\bÝ\u0001\u0010*R%\u0010t\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bt\u0010»\u0001\u0012\u0006\bß\u0001\u0010\u0001\u001a\u0004\bt\u0010*R%\u0010u\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bu\u0010»\u0001\u0012\u0006\bà\u0001\u0010\u0001\u001a\u0004\bu\u0010*R%\u0010v\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bv\u0010»\u0001\u0012\u0006\bá\u0001\u0010\u0001\u001a\u0004\bv\u0010*R%\u0010w\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bw\u0010»\u0001\u0012\u0006\bâ\u0001\u0010\u0001\u001a\u0004\bw\u0010*R%\u0010x\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\bx\u0010»\u0001\u0012\u0006\bã\u0001\u0010\u0001\u001a\u0004\bx\u0010*R'\u0010y\u001a\u0004\u0018\u00010E8\u0006X\u0004¢\u0006\u0017\n\u0005\by\u0010ä\u0001\u0012\u0006\bç\u0001\u0010\u0001\u001a\u0006\bå\u0001\u0010æ\u0001R'\u0010z\u001a\u0004\u0018\u00010G8\u0006X\u0004¢\u0006\u0017\n\u0005\bz\u0010è\u0001\u0012\u0006\bë\u0001\u0010\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R'\u0010{\u001a\u0004\u0018\u00010I8\u0006X\u0004¢\u0006\u0017\n\u0005\b{\u0010ì\u0001\u0012\u0006\bï\u0001\u0010\u0001\u001a\u0006\bí\u0001\u0010î\u0001¨\u0006û\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOfferAssortment;", "component6", "", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "component12", "component13", "", "component14", "()Ljava/lang/Double;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAvailability;", "component15", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices;", "component16", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;", "component17", "", "component18", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffOfferFlags;", "component19", "component20", "", "component21", "()Ljava/lang/Boolean;", "component22", "component23", "component24", "component25", "component26", "component27", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffShipping;", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffDisplayLabel;", "component47", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffChannelType;", "component48", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability;", "component49", "gtin", "facilityId", "facilityServiceId", "cdbase", "metiRef", "assortment", "purchasingStep", "purchasingMin", "purchasingMax", "origin", "labelHighlight", "weightingFactor", "freshnessGaranteed", "score", "availability", "prices", "bffPromo", "bffDiscounts", "flags", "offerId", "isVariableWeight", "isAlternativeCheaper", "bffVariableWeightSafetyMargin", "shopId", "shopName", "productStateCode", "offerRank", "shipping", "isNew", "isEligible", "isDigitalCard", "isPremium", "isIndispensable", "isInAssortment", "bffIsStopped", "bffIsIncontournable", "bffIsPurchasable", "promoTypeSort", "promotionHighlight", "isUnavoidable", "pictedInWarehouse", "isStockInfinite", "isPreorder", "isRelayPointEligible", "isExpressWithdrawalEligible", "isInnovation", "bffDisplayLabel", "bffChannelType", "traceability", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOfferAssortment;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAvailability;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffOfferFlags;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffShipping;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffDisplayLabel;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffChannelType;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getGtin", "()Ljava/lang/String;", "getGtin$annotations", "()V", "getFacilityId", "getFacilityId$annotations", "getFacilityServiceId", "getFacilityServiceId$annotations", "getCdbase", "getCdbase$annotations", "getMetiRef", "getMetiRef$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOfferAssortment;", "getAssortment", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOfferAssortment;", "getAssortment$annotations", "Ljava/lang/Integer;", "getPurchasingStep", "getPurchasingStep$annotations", "getPurchasingMin", "getPurchasingMin$annotations", "getPurchasingMax", "getPurchasingMax$annotations", "getOrigin", "getOrigin$annotations", "getLabelHighlight", "getLabelHighlight$annotations", "getWeightingFactor", "getWeightingFactor$annotations", "getFreshnessGaranteed", "getFreshnessGaranteed$annotations", "Ljava/lang/Double;", "getScore", "getScore$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAvailability;", "getAvailability", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAvailability;", "getAvailability$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices;", "getPrices", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices;", "getPrices$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;", "getBffPromo", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;", "getBffPromo$annotations", "Ljava/util/List;", "getBffDiscounts", "()Ljava/util/List;", "getBffDiscounts$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffOfferFlags;", "getFlags", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffOfferFlags;", "getFlags$annotations", "getOfferId", "getOfferId$annotations", "Ljava/lang/Boolean;", "isVariableWeight$annotations", "isAlternativeCheaper$annotations", "getBffVariableWeightSafetyMargin", "getBffVariableWeightSafetyMargin$annotations", "getShopId", "getShopId$annotations", "getShopName", "getShopName$annotations", "getProductStateCode", "getProductStateCode$annotations", "getOfferRank", "getOfferRank$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffShipping;", "getShipping", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffShipping;", "getShipping$annotations", "isNew$annotations", "isEligible$annotations", "isDigitalCard$annotations", "isPremium$annotations", "isIndispensable$annotations", "isInAssortment$annotations", "getBffIsStopped", "getBffIsStopped$annotations", "getBffIsIncontournable", "getBffIsIncontournable$annotations", "getBffIsPurchasable", "getBffIsPurchasable$annotations", "getPromoTypeSort", "getPromoTypeSort$annotations", "getPromotionHighlight", "getPromotionHighlight$annotations", "isUnavoidable$annotations", "getPictedInWarehouse", "getPictedInWarehouse$annotations", "isStockInfinite$annotations", "isPreorder$annotations", "isRelayPointEligible$annotations", "isExpressWithdrawalEligible$annotations", "isInnovation$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffDisplayLabel;", "getBffDisplayLabel", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffDisplayLabel;", "getBffDisplayLabel$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffChannelType;", "getBffChannelType", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffChannelType;", "getBffChannelType$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability;", "getTraceability", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability;", "getTraceability$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOfferAssortment;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAvailability;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffOfferFlags;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffShipping;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffDisplayLabel;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffChannelType;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability;)V", "seen1", "seen2", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOfferAssortment;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAvailability;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffOfferFlags;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffShipping;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffDisplayLabel;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffChannelType;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "BffChannelType", "BffDisplayLabel", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffProductOffer {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C12269f(BffBffDiscount$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffProductOfferAssortment assortment;
    @C12580l
    private final BffAvailability availability;
    @C12580l
    private final BffChannelType bffChannelType;
    @C12580l
    private final List<BffBffDiscount> bffDiscounts;
    @C12580l
    private final BffDisplayLabel bffDisplayLabel;
    @C12580l
    private final Boolean bffIsIncontournable;
    @C12580l
    private final Boolean bffIsPurchasable;
    @C12580l
    private final Boolean bffIsStopped;
    @C12580l
    private final BffBffDiscount bffPromo;
    @C12580l
    private final String bffVariableWeightSafetyMargin;
    @C12580l
    private final String cdbase;
    @C12580l
    private final String facilityId;
    @C12580l
    private final String facilityServiceId;
    @C12580l
    private final BffOfferFlags flags;
    @C12580l
    private final String freshnessGaranteed;
    @C12580l
    private final String gtin;
    @C12580l
    private final Boolean isAlternativeCheaper;
    @C12580l
    private final Boolean isDigitalCard;
    @C12580l
    private final Boolean isEligible;
    @C12580l
    private final Boolean isExpressWithdrawalEligible;
    @C12580l
    private final Boolean isInAssortment;
    @C12580l
    private final Boolean isIndispensable;
    @C12580l
    private final Boolean isInnovation;
    @C12580l
    private final Boolean isNew;
    @C12580l
    private final Boolean isPremium;
    @C12580l
    private final Boolean isPreorder;
    @C12580l
    private final Boolean isRelayPointEligible;
    @C12580l
    private final Boolean isStockInfinite;
    @C12580l
    private final Boolean isUnavoidable;
    @C12580l
    private final Boolean isVariableWeight;
    @C12580l
    private final String labelHighlight;
    @C12580l
    private final String metiRef;
    @C12580l
    private final String offerId;
    @C12580l
    private final String offerRank;
    @C12580l
    private final String origin;
    @C12580l
    private final Boolean pictedInWarehouse;
    @C12580l
    private final BffPrices prices;
    @C12580l
    private final String productStateCode;
    @C12580l
    private final Integer promoTypeSort;
    @C12580l
    private final String promotionHighlight;
    @C12580l
    private final Integer purchasingMax;
    @C12580l
    private final Integer purchasingMin;
    @C12580l
    private final Integer purchasingStep;
    @C12580l
    private final Double score;
    @C12580l
    private final BffShipping shipping;
    @C12580l
    private final String shopId;
    @C12580l
    private final String shopName;
    @C12580l
    private final BffTraceability traceability;
    @C12580l
    private final Integer weightingFactor;

    @C12439o
    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffChannelType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hOMEDELIVERYNAL", "eXPRESSDELIVERY", "mARKETPLACE", "dRIVECLCV", "uNKNOWN", "$serializer", "Companion", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public enum BffChannelType {
        hOMEDELIVERYNAL("HOME_DELIVERY_NAL"),
        eXPRESSDELIVERY("EXPRESS_DELIVERY"),
        mARKETPLACE("MARKETPLACE"),
        dRIVECLCV("DRIVE_CLCV"),
        uNKNOWN("UNKNOWN");
        
        /* access modifiers changed from: private */
        @C12579k
        public static final C11677z<C12248g<Object>> $cachedSerializer$delegate = null;
        @C12579k
        public static final Companion Companion = null;
        @C12579k
        private final String value;

        @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffChannelType$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffChannelType;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ C12248g get$cachedSerializer() {
                return (C12248g) BffChannelType.$cachedSerializer$delegate.getValue();
            }

            @C12579k
            public final C12248g<BffChannelType> serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, Companion.C393591.INSTANCE);
        }

        private BffChannelType(String str) {
            this.value = str;
        }

        @C12579k
        public final String getValue() {
            return this.value;
        }
    }

    @C12439o
    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffDisplayLabel;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "lABELHIGHLIGHT", "iSPREORDER", "iSNEW", "iSINNOVATION", "uNKNOWN", "$serializer", "Companion", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public enum BffDisplayLabel {
        lABELHIGHLIGHT("LABEL_HIGHLIGHT"),
        iSPREORDER("IS_PREORDER"),
        iSNEW("IS_NEW"),
        iSINNOVATION("IS_INNOVATION"),
        uNKNOWN("UNKNOWN");
        
        /* access modifiers changed from: private */
        @C12579k
        public static final C11677z<C12248g<Object>> $cachedSerializer$delegate = null;
        @C12579k
        public static final Companion Companion = null;
        @C12579k
        private final String value;

        @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffDisplayLabel$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$BffDisplayLabel;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ C12248g get$cachedSerializer() {
                return (C12248g) BffDisplayLabel.$cachedSerializer$delegate.getValue();
            }

            @C12579k
            public final C12248g<BffDisplayLabel> serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, Companion.C393601.INSTANCE);
        }

        private BffDisplayLabel(String str) {
            this.value = str;
        }

        @C12579k
        public final String getValue() {
            return this.value;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffProductOffer> serializer() {
            return BffProductOffer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffProductOffer() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (BffProductOfferAssortment) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, (Double) null, (BffAvailability) null, (BffPrices) null, (BffBffDiscount) null, (List) null, (BffOfferFlags) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BffShipping) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (BffDisplayLabel) null, (BffChannelType) null, (BffTraceability) null, -1, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffProductOffer copy$default(BffProductOffer bffProductOffer, String str, String str2, String str3, String str4, String str5, BffProductOfferAssortment bffProductOfferAssortment, Integer num, Integer num2, Integer num3, String str6, String str7, Integer num4, String str8, Double d, BffAvailability bffAvailability, BffPrices bffPrices, BffBffDiscount bffBffDiscount, List list, BffOfferFlags bffOfferFlags, String str9, Boolean bool, Boolean bool2, String str10, String str11, String str12, String str13, String str14, BffShipping bffShipping, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Integer num5, String str15, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, BffDisplayLabel bffDisplayLabel2, BffChannelType bffChannelType2, BffTraceability bffTraceability, int i, int i2, Object obj) {
        BffProductOffer bffProductOffer2 = bffProductOffer;
        int i3 = i;
        int i4 = i2;
        return bffProductOffer.copy((i3 & 1) != 0 ? bffProductOffer2.gtin : str, (i3 & 2) != 0 ? bffProductOffer2.facilityId : str2, (i3 & 4) != 0 ? bffProductOffer2.facilityServiceId : str3, (i3 & 8) != 0 ? bffProductOffer2.cdbase : str4, (i3 & 16) != 0 ? bffProductOffer2.metiRef : str5, (i3 & 32) != 0 ? bffProductOffer2.assortment : bffProductOfferAssortment, (i3 & 64) != 0 ? bffProductOffer2.purchasingStep : num, (i3 & 128) != 0 ? bffProductOffer2.purchasingMin : num2, (i3 & 256) != 0 ? bffProductOffer2.purchasingMax : num3, (i3 & 512) != 0 ? bffProductOffer2.origin : str6, (i3 & 1024) != 0 ? bffProductOffer2.labelHighlight : str7, (i3 & 2048) != 0 ? bffProductOffer2.weightingFactor : num4, (i3 & 4096) != 0 ? bffProductOffer2.freshnessGaranteed : str8, (i3 & 8192) != 0 ? bffProductOffer2.score : d, (i3 & 16384) != 0 ? bffProductOffer2.availability : bffAvailability, (i3 & 32768) != 0 ? bffProductOffer2.prices : bffPrices, (i3 & 65536) != 0 ? bffProductOffer2.bffPromo : bffBffDiscount, (i3 & 131072) != 0 ? bffProductOffer2.bffDiscounts : list, (i3 & 262144) != 0 ? bffProductOffer2.flags : bffOfferFlags, (i3 & 524288) != 0 ? bffProductOffer2.offerId : str9, (i3 & 1048576) != 0 ? bffProductOffer2.isVariableWeight : bool, (i3 & 2097152) != 0 ? bffProductOffer2.isAlternativeCheaper : bool2, (i3 & 4194304) != 0 ? bffProductOffer2.bffVariableWeightSafetyMargin : str10, (i3 & 8388608) != 0 ? bffProductOffer2.shopId : str11, (i3 & 16777216) != 0 ? bffProductOffer2.shopName : str12, (i3 & C9647e0.f26435a) != 0 ? bffProductOffer2.productStateCode : str13, (i3 & C8698y1.f23302n) != 0 ? bffProductOffer2.offerRank : str14, (i3 & C8698y1.f23301m) != 0 ? bffProductOffer2.shipping : bffShipping, (i3 & 268435456) != 0 ? bffProductOffer2.isNew : bool3, (i3 & 536870912) != 0 ? bffProductOffer2.isEligible : bool4, (i3 & 1073741824) != 0 ? bffProductOffer2.isDigitalCard : bool5, (i3 & Integer.MIN_VALUE) != 0 ? bffProductOffer2.isPremium : bool6, (i4 & 1) != 0 ? bffProductOffer2.isIndispensable : bool7, (i4 & 2) != 0 ? bffProductOffer2.isInAssortment : bool8, (i4 & 4) != 0 ? bffProductOffer2.bffIsStopped : bool9, (i4 & 8) != 0 ? bffProductOffer2.bffIsIncontournable : bool10, (i4 & 16) != 0 ? bffProductOffer2.bffIsPurchasable : bool11, (i4 & 32) != 0 ? bffProductOffer2.promoTypeSort : num5, (i4 & 64) != 0 ? bffProductOffer2.promotionHighlight : str15, (i4 & 128) != 0 ? bffProductOffer2.isUnavoidable : bool12, (i4 & 256) != 0 ? bffProductOffer2.pictedInWarehouse : bool13, (i4 & 512) != 0 ? bffProductOffer2.isStockInfinite : bool14, (i4 & 1024) != 0 ? bffProductOffer2.isPreorder : bool15, (i4 & 2048) != 0 ? bffProductOffer2.isRelayPointEligible : bool16, (i4 & 4096) != 0 ? bffProductOffer2.isExpressWithdrawalEligible : bool17, (i4 & 8192) != 0 ? bffProductOffer2.isInnovation : bool18, (i4 & 16384) != 0 ? bffProductOffer2.bffDisplayLabel : bffDisplayLabel2, (i4 & 32768) != 0 ? bffProductOffer2.bffChannelType : bffChannelType2, (i4 & 65536) != 0 ? bffProductOffer2.traceability : bffTraceability);
    }

    @C12438n("assortment")
    public static /* synthetic */ void getAssortment$annotations() {
    }

    @C12438n("availability")
    public static /* synthetic */ void getAvailability$annotations() {
    }

    @C12438n("bff_channel_type")
    public static /* synthetic */ void getBffChannelType$annotations() {
    }

    @C12438n("bff_discounts")
    public static /* synthetic */ void getBffDiscounts$annotations() {
    }

    @C12438n("bff_display_label")
    public static /* synthetic */ void getBffDisplayLabel$annotations() {
    }

    @C12438n("bff_is_incontournable")
    public static /* synthetic */ void getBffIsIncontournable$annotations() {
    }

    @C12438n("bff_is_purchasable")
    public static /* synthetic */ void getBffIsPurchasable$annotations() {
    }

    @C12438n("bff_is_stopped")
    public static /* synthetic */ void getBffIsStopped$annotations() {
    }

    @C12438n("bff_promo")
    public static /* synthetic */ void getBffPromo$annotations() {
    }

    @C12438n("bff_variable_weight_safety_margin")
    public static /* synthetic */ void getBffVariableWeightSafetyMargin$annotations() {
    }

    @C12438n("cdbase")
    public static /* synthetic */ void getCdbase$annotations() {
    }

    @C12438n("facility_id")
    public static /* synthetic */ void getFacilityId$annotations() {
    }

    @C12438n("facility_service_id")
    public static /* synthetic */ void getFacilityServiceId$annotations() {
    }

    @C12438n("flags")
    public static /* synthetic */ void getFlags$annotations() {
    }

    @C12438n("freshness_garanteed")
    public static /* synthetic */ void getFreshnessGaranteed$annotations() {
    }

    @C12438n("gtin")
    public static /* synthetic */ void getGtin$annotations() {
    }

    @C12438n("label_highlight")
    public static /* synthetic */ void getLabelHighlight$annotations() {
    }

    @C12438n("meti_ref")
    public static /* synthetic */ void getMetiRef$annotations() {
    }

    @C12438n("offer_id")
    public static /* synthetic */ void getOfferId$annotations() {
    }

    @C12438n("offer_rank")
    public static /* synthetic */ void getOfferRank$annotations() {
    }

    @C12438n("origin")
    public static /* synthetic */ void getOrigin$annotations() {
    }

    @C12438n("picted_in_warehouse")
    public static /* synthetic */ void getPictedInWarehouse$annotations() {
    }

    @C12438n("prices")
    public static /* synthetic */ void getPrices$annotations() {
    }

    @C12438n("product_state_code")
    public static /* synthetic */ void getProductStateCode$annotations() {
    }

    @C12438n("promo_type_sort")
    public static /* synthetic */ void getPromoTypeSort$annotations() {
    }

    @C12438n("promotion_highlight")
    public static /* synthetic */ void getPromotionHighlight$annotations() {
    }

    @C12438n("purchasing_max")
    public static /* synthetic */ void getPurchasingMax$annotations() {
    }

    @C12438n("purchasing_min")
    public static /* synthetic */ void getPurchasingMin$annotations() {
    }

    @C12438n("purchasing_step")
    public static /* synthetic */ void getPurchasingStep$annotations() {
    }

    @C12438n("score")
    public static /* synthetic */ void getScore$annotations() {
    }

    @C12438n("shipping")
    public static /* synthetic */ void getShipping$annotations() {
    }

    @C12438n("shop_id")
    public static /* synthetic */ void getShopId$annotations() {
    }

    @C12438n("shop_name")
    public static /* synthetic */ void getShopName$annotations() {
    }

    @C12438n("traceability")
    public static /* synthetic */ void getTraceability$annotations() {
    }

    @C12438n("weighting_factor")
    public static /* synthetic */ void getWeightingFactor$annotations() {
    }

    @C12438n("is_alternative_cheaper")
    public static /* synthetic */ void isAlternativeCheaper$annotations() {
    }

    @C12438n("is_digital_card")
    public static /* synthetic */ void isDigitalCard$annotations() {
    }

    @C12438n("is_eligible")
    public static /* synthetic */ void isEligible$annotations() {
    }

    @C12438n("is_express_withdrawal_eligible")
    public static /* synthetic */ void isExpressWithdrawalEligible$annotations() {
    }

    @C12438n("is_in_assortment")
    public static /* synthetic */ void isInAssortment$annotations() {
    }

    @C12438n("is_indispensable")
    public static /* synthetic */ void isIndispensable$annotations() {
    }

    @C12438n("is_innovation")
    public static /* synthetic */ void isInnovation$annotations() {
    }

    @C12438n("is_new")
    public static /* synthetic */ void isNew$annotations() {
    }

    @C12438n("is_premium")
    public static /* synthetic */ void isPremium$annotations() {
    }

    @C12438n("is_preorder")
    public static /* synthetic */ void isPreorder$annotations() {
    }

    @C12438n("is_relay_point_eligible")
    public static /* synthetic */ void isRelayPointEligible$annotations() {
    }

    @C12438n("is_stock_infinite")
    public static /* synthetic */ void isStockInfinite$annotations() {
    }

    @C12438n("is_unavoidable")
    public static /* synthetic */ void isUnavoidable$annotations() {
    }

    @C12438n("is_variable_weight")
    public static /* synthetic */ void isVariableWeight$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffProductOffer bffProductOffer, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffProductOffer.gtin != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffProductOffer.gtin);
        }
        if (dVar.mo24897A(fVar, 1) || bffProductOffer.facilityId != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffProductOffer.facilityId);
        }
        if (dVar.mo24897A(fVar, 2) || bffProductOffer.facilityServiceId != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffProductOffer.facilityServiceId);
        }
        if (dVar.mo24897A(fVar, 3) || bffProductOffer.cdbase != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffProductOffer.cdbase);
        }
        if (dVar.mo24897A(fVar, 4) || bffProductOffer.metiRef != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffProductOffer.metiRef);
        }
        if (dVar.mo24897A(fVar, 5) || bffProductOffer.assortment != null) {
            dVar.mo24912i(fVar, 5, BffProductOfferAssortment$$serializer.INSTANCE, bffProductOffer.assortment);
        }
        if (dVar.mo24897A(fVar, 6) || bffProductOffer.purchasingStep != null) {
            dVar.mo24912i(fVar, 6, C12276h0.f30067a, bffProductOffer.purchasingStep);
        }
        if (dVar.mo24897A(fVar, 7) || bffProductOffer.purchasingMin != null) {
            dVar.mo24912i(fVar, 7, C12276h0.f30067a, bffProductOffer.purchasingMin);
        }
        if (dVar.mo24897A(fVar, 8) || bffProductOffer.purchasingMax != null) {
            dVar.mo24912i(fVar, 8, C12276h0.f30067a, bffProductOffer.purchasingMax);
        }
        if (dVar.mo24897A(fVar, 9) || bffProductOffer.origin != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffProductOffer.origin);
        }
        if (dVar.mo24897A(fVar, 10) || bffProductOffer.labelHighlight != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffProductOffer.labelHighlight);
        }
        if (dVar.mo24897A(fVar, 11) || bffProductOffer.weightingFactor != null) {
            dVar.mo24912i(fVar, 11, C12276h0.f30067a, bffProductOffer.weightingFactor);
        }
        if (dVar.mo24897A(fVar, 12) || bffProductOffer.freshnessGaranteed != null) {
            dVar.mo24912i(fVar, 12, C12310s1.f30117a, bffProductOffer.freshnessGaranteed);
        }
        if (dVar.mo24897A(fVar, 13) || bffProductOffer.score != null) {
            dVar.mo24912i(fVar, 13, C12311t.f30119a, bffProductOffer.score);
        }
        if (dVar.mo24897A(fVar, 14) || bffProductOffer.availability != null) {
            dVar.mo24912i(fVar, 14, BffAvailability$$serializer.INSTANCE, bffProductOffer.availability);
        }
        if (dVar.mo24897A(fVar, 15) || bffProductOffer.prices != null) {
            dVar.mo24912i(fVar, 15, BffPrices$$serializer.INSTANCE, bffProductOffer.prices);
        }
        if (dVar.mo24897A(fVar, 16) || bffProductOffer.bffPromo != null) {
            dVar.mo24912i(fVar, 16, BffBffDiscount$$serializer.INSTANCE, bffProductOffer.bffPromo);
        }
        if (dVar.mo24897A(fVar, 17) || bffProductOffer.bffDiscounts != null) {
            dVar.mo24912i(fVar, 17, gVarArr[17], bffProductOffer.bffDiscounts);
        }
        if (dVar.mo24897A(fVar, 18) || bffProductOffer.flags != null) {
            dVar.mo24912i(fVar, 18, BffOfferFlags$$serializer.INSTANCE, bffProductOffer.flags);
        }
        if (dVar.mo24897A(fVar, 19) || bffProductOffer.offerId != null) {
            dVar.mo24912i(fVar, 19, C12310s1.f30117a, bffProductOffer.offerId);
        }
        if (dVar.mo24897A(fVar, 20) || bffProductOffer.isVariableWeight != null) {
            dVar.mo24912i(fVar, 20, C12278i.f30070a, bffProductOffer.isVariableWeight);
        }
        if (dVar.mo24897A(fVar, 21) || bffProductOffer.isAlternativeCheaper != null) {
            dVar.mo24912i(fVar, 21, C12278i.f30070a, bffProductOffer.isAlternativeCheaper);
        }
        if (dVar.mo24897A(fVar, 22) || bffProductOffer.bffVariableWeightSafetyMargin != null) {
            dVar.mo24912i(fVar, 22, C12310s1.f30117a, bffProductOffer.bffVariableWeightSafetyMargin);
        }
        if (dVar.mo24897A(fVar, 23) || bffProductOffer.shopId != null) {
            dVar.mo24912i(fVar, 23, C12310s1.f30117a, bffProductOffer.shopId);
        }
        if (dVar.mo24897A(fVar, 24) || bffProductOffer.shopName != null) {
            dVar.mo24912i(fVar, 24, C12310s1.f30117a, bffProductOffer.shopName);
        }
        if (dVar.mo24897A(fVar, 25) || bffProductOffer.productStateCode != null) {
            dVar.mo24912i(fVar, 25, C12310s1.f30117a, bffProductOffer.productStateCode);
        }
        if (dVar.mo24897A(fVar, 26) || bffProductOffer.offerRank != null) {
            dVar.mo24912i(fVar, 26, C12310s1.f30117a, bffProductOffer.offerRank);
        }
        if (dVar.mo24897A(fVar, 27) || bffProductOffer.shipping != null) {
            dVar.mo24912i(fVar, 27, BffShipping$$serializer.INSTANCE, bffProductOffer.shipping);
        }
        if (dVar.mo24897A(fVar, 28) || bffProductOffer.isNew != null) {
            dVar.mo24912i(fVar, 28, C12278i.f30070a, bffProductOffer.isNew);
        }
        if (dVar.mo24897A(fVar, 29) || bffProductOffer.isEligible != null) {
            dVar.mo24912i(fVar, 29, C12278i.f30070a, bffProductOffer.isEligible);
        }
        if (dVar.mo24897A(fVar, 30) || bffProductOffer.isDigitalCard != null) {
            dVar.mo24912i(fVar, 30, C12278i.f30070a, bffProductOffer.isDigitalCard);
        }
        if (dVar.mo24897A(fVar, 31) || bffProductOffer.isPremium != null) {
            dVar.mo24912i(fVar, 31, C12278i.f30070a, bffProductOffer.isPremium);
        }
        if (dVar.mo24897A(fVar, 32) || bffProductOffer.isIndispensable != null) {
            dVar.mo24912i(fVar, 32, C12278i.f30070a, bffProductOffer.isIndispensable);
        }
        if (dVar.mo24897A(fVar, 33) || bffProductOffer.isInAssortment != null) {
            dVar.mo24912i(fVar, 33, C12278i.f30070a, bffProductOffer.isInAssortment);
        }
        if (dVar.mo24897A(fVar, 34) || bffProductOffer.bffIsStopped != null) {
            dVar.mo24912i(fVar, 34, C12278i.f30070a, bffProductOffer.bffIsStopped);
        }
        if (dVar.mo24897A(fVar, 35) || bffProductOffer.bffIsIncontournable != null) {
            dVar.mo24912i(fVar, 35, C12278i.f30070a, bffProductOffer.bffIsIncontournable);
        }
        if (dVar.mo24897A(fVar, 36) || bffProductOffer.bffIsPurchasable != null) {
            dVar.mo24912i(fVar, 36, C12278i.f30070a, bffProductOffer.bffIsPurchasable);
        }
        if (dVar.mo24897A(fVar, 37) || bffProductOffer.promoTypeSort != null) {
            dVar.mo24912i(fVar, 37, C12276h0.f30067a, bffProductOffer.promoTypeSort);
        }
        if (dVar.mo24897A(fVar, 38) || bffProductOffer.promotionHighlight != null) {
            dVar.mo24912i(fVar, 38, C12310s1.f30117a, bffProductOffer.promotionHighlight);
        }
        if (dVar.mo24897A(fVar, 39) || bffProductOffer.isUnavoidable != null) {
            dVar.mo24912i(fVar, 39, C12278i.f30070a, bffProductOffer.isUnavoidable);
        }
        if (dVar.mo24897A(fVar, 40) || bffProductOffer.pictedInWarehouse != null) {
            dVar.mo24912i(fVar, 40, C12278i.f30070a, bffProductOffer.pictedInWarehouse);
        }
        if (dVar.mo24897A(fVar, 41) || bffProductOffer.isStockInfinite != null) {
            dVar.mo24912i(fVar, 41, C12278i.f30070a, bffProductOffer.isStockInfinite);
        }
        if (dVar.mo24897A(fVar, 42) || bffProductOffer.isPreorder != null) {
            dVar.mo24912i(fVar, 42, C12278i.f30070a, bffProductOffer.isPreorder);
        }
        if (dVar.mo24897A(fVar, 43) || bffProductOffer.isRelayPointEligible != null) {
            dVar.mo24912i(fVar, 43, C12278i.f30070a, bffProductOffer.isRelayPointEligible);
        }
        if (dVar.mo24897A(fVar, 44) || bffProductOffer.isExpressWithdrawalEligible != null) {
            dVar.mo24912i(fVar, 44, C12278i.f30070a, bffProductOffer.isExpressWithdrawalEligible);
        }
        if (dVar.mo24897A(fVar, 45) || bffProductOffer.isInnovation != null) {
            dVar.mo24912i(fVar, 45, C12278i.f30070a, bffProductOffer.isInnovation);
        }
        if (dVar.mo24897A(fVar, 46) || bffProductOffer.bffDisplayLabel != null) {
            dVar.mo24912i(fVar, 46, BffProductOffer$BffDisplayLabel$$serializer.INSTANCE, bffProductOffer.bffDisplayLabel);
        }
        if (dVar.mo24897A(fVar, 47) || bffProductOffer.bffChannelType != null) {
            dVar.mo24912i(fVar, 47, BffProductOffer$BffChannelType$$serializer.INSTANCE, bffProductOffer.bffChannelType);
        }
        if (dVar.mo24897A(fVar, 48) || bffProductOffer.traceability != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 48, BffTraceability$$serializer.INSTANCE, bffProductOffer.traceability);
        }
    }

    @C12580l
    public final String component1() {
        return this.gtin;
    }

    @C12580l
    public final String component10() {
        return this.origin;
    }

    @C12580l
    public final String component11() {
        return this.labelHighlight;
    }

    @C12580l
    public final Integer component12() {
        return this.weightingFactor;
    }

    @C12580l
    public final String component13() {
        return this.freshnessGaranteed;
    }

    @C12580l
    public final Double component14() {
        return this.score;
    }

    @C12580l
    public final BffAvailability component15() {
        return this.availability;
    }

    @C12580l
    public final BffPrices component16() {
        return this.prices;
    }

    @C12580l
    public final BffBffDiscount component17() {
        return this.bffPromo;
    }

    @C12580l
    public final List<BffBffDiscount> component18() {
        return this.bffDiscounts;
    }

    @C12580l
    public final BffOfferFlags component19() {
        return this.flags;
    }

    @C12580l
    public final String component2() {
        return this.facilityId;
    }

    @C12580l
    public final String component20() {
        return this.offerId;
    }

    @C12580l
    public final Boolean component21() {
        return this.isVariableWeight;
    }

    @C12580l
    public final Boolean component22() {
        return this.isAlternativeCheaper;
    }

    @C12580l
    public final String component23() {
        return this.bffVariableWeightSafetyMargin;
    }

    @C12580l
    public final String component24() {
        return this.shopId;
    }

    @C12580l
    public final String component25() {
        return this.shopName;
    }

    @C12580l
    public final String component26() {
        return this.productStateCode;
    }

    @C12580l
    public final String component27() {
        return this.offerRank;
    }

    @C12580l
    public final BffShipping component28() {
        return this.shipping;
    }

    @C12580l
    public final Boolean component29() {
        return this.isNew;
    }

    @C12580l
    public final String component3() {
        return this.facilityServiceId;
    }

    @C12580l
    public final Boolean component30() {
        return this.isEligible;
    }

    @C12580l
    public final Boolean component31() {
        return this.isDigitalCard;
    }

    @C12580l
    public final Boolean component32() {
        return this.isPremium;
    }

    @C12580l
    public final Boolean component33() {
        return this.isIndispensable;
    }

    @C12580l
    public final Boolean component34() {
        return this.isInAssortment;
    }

    @C12580l
    public final Boolean component35() {
        return this.bffIsStopped;
    }

    @C12580l
    public final Boolean component36() {
        return this.bffIsIncontournable;
    }

    @C12580l
    public final Boolean component37() {
        return this.bffIsPurchasable;
    }

    @C12580l
    public final Integer component38() {
        return this.promoTypeSort;
    }

    @C12580l
    public final String component39() {
        return this.promotionHighlight;
    }

    @C12580l
    public final String component4() {
        return this.cdbase;
    }

    @C12580l
    public final Boolean component40() {
        return this.isUnavoidable;
    }

    @C12580l
    public final Boolean component41() {
        return this.pictedInWarehouse;
    }

    @C12580l
    public final Boolean component42() {
        return this.isStockInfinite;
    }

    @C12580l
    public final Boolean component43() {
        return this.isPreorder;
    }

    @C12580l
    public final Boolean component44() {
        return this.isRelayPointEligible;
    }

    @C12580l
    public final Boolean component45() {
        return this.isExpressWithdrawalEligible;
    }

    @C12580l
    public final Boolean component46() {
        return this.isInnovation;
    }

    @C12580l
    public final BffDisplayLabel component47() {
        return this.bffDisplayLabel;
    }

    @C12580l
    public final BffChannelType component48() {
        return this.bffChannelType;
    }

    @C12580l
    public final BffTraceability component49() {
        return this.traceability;
    }

    @C12580l
    public final String component5() {
        return this.metiRef;
    }

    @C12580l
    public final BffProductOfferAssortment component6() {
        return this.assortment;
    }

    @C12580l
    public final Integer component7() {
        return this.purchasingStep;
    }

    @C12580l
    public final Integer component8() {
        return this.purchasingMin;
    }

    @C12580l
    public final Integer component9() {
        return this.purchasingMax;
    }

    @C12579k
    public final BffProductOffer copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l BffProductOfferAssortment bffProductOfferAssortment, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l String str6, @C12580l String str7, @C12580l Integer num4, @C12580l String str8, @C12580l Double d, @C12580l BffAvailability bffAvailability, @C12580l BffPrices bffPrices, @C12580l BffBffDiscount bffBffDiscount, @C12580l List<BffBffDiscount> list, @C12580l BffOfferFlags bffOfferFlags, @C12580l String str9, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l BffShipping bffShipping, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12580l Boolean bool5, @C12580l Boolean bool6, @C12580l Boolean bool7, @C12580l Boolean bool8, @C12580l Boolean bool9, @C12580l Boolean bool10, @C12580l Boolean bool11, @C12580l Integer num5, @C12580l String str15, @C12580l Boolean bool12, @C12580l Boolean bool13, @C12580l Boolean bool14, @C12580l Boolean bool15, @C12580l Boolean bool16, @C12580l Boolean bool17, @C12580l Boolean bool18, @C12580l BffDisplayLabel bffDisplayLabel2, @C12580l BffChannelType bffChannelType2, @C12580l BffTraceability bffTraceability) {
        return new BffProductOffer(str, str2, str3, str4, str5, bffProductOfferAssortment, num, num2, num3, str6, str7, num4, str8, d, bffAvailability, bffPrices, bffBffDiscount, list, bffOfferFlags, str9, bool, bool2, str10, str11, str12, str13, str14, bffShipping, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, num5, str15, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bffDisplayLabel2, bffChannelType2, bffTraceability);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffProductOffer)) {
            return false;
        }
        BffProductOffer bffProductOffer = (BffProductOffer) obj;
        return Intrinsics.areEqual((Object) this.gtin, (Object) bffProductOffer.gtin) && Intrinsics.areEqual((Object) this.facilityId, (Object) bffProductOffer.facilityId) && Intrinsics.areEqual((Object) this.facilityServiceId, (Object) bffProductOffer.facilityServiceId) && Intrinsics.areEqual((Object) this.cdbase, (Object) bffProductOffer.cdbase) && Intrinsics.areEqual((Object) this.metiRef, (Object) bffProductOffer.metiRef) && Intrinsics.areEqual((Object) this.assortment, (Object) bffProductOffer.assortment) && Intrinsics.areEqual((Object) this.purchasingStep, (Object) bffProductOffer.purchasingStep) && Intrinsics.areEqual((Object) this.purchasingMin, (Object) bffProductOffer.purchasingMin) && Intrinsics.areEqual((Object) this.purchasingMax, (Object) bffProductOffer.purchasingMax) && Intrinsics.areEqual((Object) this.origin, (Object) bffProductOffer.origin) && Intrinsics.areEqual((Object) this.labelHighlight, (Object) bffProductOffer.labelHighlight) && Intrinsics.areEqual((Object) this.weightingFactor, (Object) bffProductOffer.weightingFactor) && Intrinsics.areEqual((Object) this.freshnessGaranteed, (Object) bffProductOffer.freshnessGaranteed) && Intrinsics.areEqual((Object) this.score, (Object) bffProductOffer.score) && Intrinsics.areEqual((Object) this.availability, (Object) bffProductOffer.availability) && Intrinsics.areEqual((Object) this.prices, (Object) bffProductOffer.prices) && Intrinsics.areEqual((Object) this.bffPromo, (Object) bffProductOffer.bffPromo) && Intrinsics.areEqual((Object) this.bffDiscounts, (Object) bffProductOffer.bffDiscounts) && Intrinsics.areEqual((Object) this.flags, (Object) bffProductOffer.flags) && Intrinsics.areEqual((Object) this.offerId, (Object) bffProductOffer.offerId) && Intrinsics.areEqual((Object) this.isVariableWeight, (Object) bffProductOffer.isVariableWeight) && Intrinsics.areEqual((Object) this.isAlternativeCheaper, (Object) bffProductOffer.isAlternativeCheaper) && Intrinsics.areEqual((Object) this.bffVariableWeightSafetyMargin, (Object) bffProductOffer.bffVariableWeightSafetyMargin) && Intrinsics.areEqual((Object) this.shopId, (Object) bffProductOffer.shopId) && Intrinsics.areEqual((Object) this.shopName, (Object) bffProductOffer.shopName) && Intrinsics.areEqual((Object) this.productStateCode, (Object) bffProductOffer.productStateCode) && Intrinsics.areEqual((Object) this.offerRank, (Object) bffProductOffer.offerRank) && Intrinsics.areEqual((Object) this.shipping, (Object) bffProductOffer.shipping) && Intrinsics.areEqual((Object) this.isNew, (Object) bffProductOffer.isNew) && Intrinsics.areEqual((Object) this.isEligible, (Object) bffProductOffer.isEligible) && Intrinsics.areEqual((Object) this.isDigitalCard, (Object) bffProductOffer.isDigitalCard) && Intrinsics.areEqual((Object) this.isPremium, (Object) bffProductOffer.isPremium) && Intrinsics.areEqual((Object) this.isIndispensable, (Object) bffProductOffer.isIndispensable) && Intrinsics.areEqual((Object) this.isInAssortment, (Object) bffProductOffer.isInAssortment) && Intrinsics.areEqual((Object) this.bffIsStopped, (Object) bffProductOffer.bffIsStopped) && Intrinsics.areEqual((Object) this.bffIsIncontournable, (Object) bffProductOffer.bffIsIncontournable) && Intrinsics.areEqual((Object) this.bffIsPurchasable, (Object) bffProductOffer.bffIsPurchasable) && Intrinsics.areEqual((Object) this.promoTypeSort, (Object) bffProductOffer.promoTypeSort) && Intrinsics.areEqual((Object) this.promotionHighlight, (Object) bffProductOffer.promotionHighlight) && Intrinsics.areEqual((Object) this.isUnavoidable, (Object) bffProductOffer.isUnavoidable) && Intrinsics.areEqual((Object) this.pictedInWarehouse, (Object) bffProductOffer.pictedInWarehouse) && Intrinsics.areEqual((Object) this.isStockInfinite, (Object) bffProductOffer.isStockInfinite) && Intrinsics.areEqual((Object) this.isPreorder, (Object) bffProductOffer.isPreorder) && Intrinsics.areEqual((Object) this.isRelayPointEligible, (Object) bffProductOffer.isRelayPointEligible) && Intrinsics.areEqual((Object) this.isExpressWithdrawalEligible, (Object) bffProductOffer.isExpressWithdrawalEligible) && Intrinsics.areEqual((Object) this.isInnovation, (Object) bffProductOffer.isInnovation) && this.bffDisplayLabel == bffProductOffer.bffDisplayLabel && this.bffChannelType == bffProductOffer.bffChannelType && Intrinsics.areEqual((Object) this.traceability, (Object) bffProductOffer.traceability);
    }

    @C12580l
    public final BffProductOfferAssortment getAssortment() {
        return this.assortment;
    }

    @C12580l
    public final BffAvailability getAvailability() {
        return this.availability;
    }

    @C12580l
    public final BffChannelType getBffChannelType() {
        return this.bffChannelType;
    }

    @C12580l
    public final List<BffBffDiscount> getBffDiscounts() {
        return this.bffDiscounts;
    }

    @C12580l
    public final BffDisplayLabel getBffDisplayLabel() {
        return this.bffDisplayLabel;
    }

    @C12580l
    public final Boolean getBffIsIncontournable() {
        return this.bffIsIncontournable;
    }

    @C12580l
    public final Boolean getBffIsPurchasable() {
        return this.bffIsPurchasable;
    }

    @C12580l
    public final Boolean getBffIsStopped() {
        return this.bffIsStopped;
    }

    @C12580l
    public final BffBffDiscount getBffPromo() {
        return this.bffPromo;
    }

    @C12580l
    public final String getBffVariableWeightSafetyMargin() {
        return this.bffVariableWeightSafetyMargin;
    }

    @C12580l
    public final String getCdbase() {
        return this.cdbase;
    }

    @C12580l
    public final String getFacilityId() {
        return this.facilityId;
    }

    @C12580l
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    @C12580l
    public final BffOfferFlags getFlags() {
        return this.flags;
    }

    @C12580l
    public final String getFreshnessGaranteed() {
        return this.freshnessGaranteed;
    }

    @C12580l
    public final String getGtin() {
        return this.gtin;
    }

    @C12580l
    public final String getLabelHighlight() {
        return this.labelHighlight;
    }

    @C12580l
    public final String getMetiRef() {
        return this.metiRef;
    }

    @C12580l
    public final String getOfferId() {
        return this.offerId;
    }

    @C12580l
    public final String getOfferRank() {
        return this.offerRank;
    }

    @C12580l
    public final String getOrigin() {
        return this.origin;
    }

    @C12580l
    public final Boolean getPictedInWarehouse() {
        return this.pictedInWarehouse;
    }

    @C12580l
    public final BffPrices getPrices() {
        return this.prices;
    }

    @C12580l
    public final String getProductStateCode() {
        return this.productStateCode;
    }

    @C12580l
    public final Integer getPromoTypeSort() {
        return this.promoTypeSort;
    }

    @C12580l
    public final String getPromotionHighlight() {
        return this.promotionHighlight;
    }

    @C12580l
    public final Integer getPurchasingMax() {
        return this.purchasingMax;
    }

    @C12580l
    public final Integer getPurchasingMin() {
        return this.purchasingMin;
    }

    @C12580l
    public final Integer getPurchasingStep() {
        return this.purchasingStep;
    }

    @C12580l
    public final Double getScore() {
        return this.score;
    }

    @C12580l
    public final BffShipping getShipping() {
        return this.shipping;
    }

    @C12580l
    public final String getShopId() {
        return this.shopId;
    }

    @C12580l
    public final String getShopName() {
        return this.shopName;
    }

    @C12580l
    public final BffTraceability getTraceability() {
        return this.traceability;
    }

    @C12580l
    public final Integer getWeightingFactor() {
        return this.weightingFactor;
    }

    public int hashCode() {
        String str = this.gtin;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.facilityId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.facilityServiceId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cdbase;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.metiRef;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BffProductOfferAssortment bffProductOfferAssortment = this.assortment;
        int hashCode6 = (hashCode5 + (bffProductOfferAssortment == null ? 0 : bffProductOfferAssortment.hashCode())) * 31;
        Integer num = this.purchasingStep;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.purchasingMin;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.purchasingMax;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.origin;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.labelHighlight;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num4 = this.weightingFactor;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.freshnessGaranteed;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d = this.score;
        int hashCode14 = (hashCode13 + (d == null ? 0 : d.hashCode())) * 31;
        BffAvailability bffAvailability = this.availability;
        int hashCode15 = (hashCode14 + (bffAvailability == null ? 0 : bffAvailability.hashCode())) * 31;
        BffPrices bffPrices = this.prices;
        int hashCode16 = (hashCode15 + (bffPrices == null ? 0 : bffPrices.hashCode())) * 31;
        BffBffDiscount bffBffDiscount = this.bffPromo;
        int hashCode17 = (hashCode16 + (bffBffDiscount == null ? 0 : bffBffDiscount.hashCode())) * 31;
        List<BffBffDiscount> list = this.bffDiscounts;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        BffOfferFlags bffOfferFlags = this.flags;
        int hashCode19 = (hashCode18 + (bffOfferFlags == null ? 0 : bffOfferFlags.hashCode())) * 31;
        String str9 = this.offerId;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.isVariableWeight;
        int hashCode21 = (hashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAlternativeCheaper;
        int hashCode22 = (hashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str10 = this.bffVariableWeightSafetyMargin;
        int hashCode23 = (hashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.shopId;
        int hashCode24 = (hashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.shopName;
        int hashCode25 = (hashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.productStateCode;
        int hashCode26 = (hashCode25 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.offerRank;
        int hashCode27 = (hashCode26 + (str14 == null ? 0 : str14.hashCode())) * 31;
        BffShipping bffShipping = this.shipping;
        int hashCode28 = (hashCode27 + (bffShipping == null ? 0 : bffShipping.hashCode())) * 31;
        Boolean bool3 = this.isNew;
        int hashCode29 = (hashCode28 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isEligible;
        int hashCode30 = (hashCode29 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isDigitalCard;
        int hashCode31 = (hashCode30 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isPremium;
        int hashCode32 = (hashCode31 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isIndispensable;
        int hashCode33 = (hashCode32 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isInAssortment;
        int hashCode34 = (hashCode33 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.bffIsStopped;
        int hashCode35 = (hashCode34 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.bffIsIncontournable;
        int hashCode36 = (hashCode35 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.bffIsPurchasable;
        int hashCode37 = (hashCode36 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Integer num5 = this.promoTypeSort;
        int hashCode38 = (hashCode37 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str15 = this.promotionHighlight;
        int hashCode39 = (hashCode38 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool12 = this.isUnavoidable;
        int hashCode40 = (hashCode39 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.pictedInWarehouse;
        int hashCode41 = (hashCode40 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.isStockInfinite;
        int hashCode42 = (hashCode41 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.isPreorder;
        int hashCode43 = (hashCode42 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.isRelayPointEligible;
        int hashCode44 = (hashCode43 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.isExpressWithdrawalEligible;
        int hashCode45 = (hashCode44 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.isInnovation;
        int hashCode46 = (hashCode45 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        BffDisplayLabel bffDisplayLabel2 = this.bffDisplayLabel;
        int hashCode47 = (hashCode46 + (bffDisplayLabel2 == null ? 0 : bffDisplayLabel2.hashCode())) * 31;
        BffChannelType bffChannelType2 = this.bffChannelType;
        int hashCode48 = (hashCode47 + (bffChannelType2 == null ? 0 : bffChannelType2.hashCode())) * 31;
        BffTraceability bffTraceability = this.traceability;
        if (bffTraceability != null) {
            i = bffTraceability.hashCode();
        }
        return hashCode48 + i;
    }

    @C12580l
    public final Boolean isAlternativeCheaper() {
        return this.isAlternativeCheaper;
    }

    @C12580l
    public final Boolean isDigitalCard() {
        return this.isDigitalCard;
    }

    @C12580l
    public final Boolean isEligible() {
        return this.isEligible;
    }

    @C12580l
    public final Boolean isExpressWithdrawalEligible() {
        return this.isExpressWithdrawalEligible;
    }

    @C12580l
    public final Boolean isInAssortment() {
        return this.isInAssortment;
    }

    @C12580l
    public final Boolean isIndispensable() {
        return this.isIndispensable;
    }

    @C12580l
    public final Boolean isInnovation() {
        return this.isInnovation;
    }

    @C12580l
    public final Boolean isNew() {
        return this.isNew;
    }

    @C12580l
    public final Boolean isPremium() {
        return this.isPremium;
    }

    @C12580l
    public final Boolean isPreorder() {
        return this.isPreorder;
    }

    @C12580l
    public final Boolean isRelayPointEligible() {
        return this.isRelayPointEligible;
    }

    @C12580l
    public final Boolean isStockInfinite() {
        return this.isStockInfinite;
    }

    @C12580l
    public final Boolean isUnavoidable() {
        return this.isUnavoidable;
    }

    @C12580l
    public final Boolean isVariableWeight() {
        return this.isVariableWeight;
    }

    @C12579k
    public String toString() {
        String str = this.gtin;
        String str2 = this.facilityId;
        String str3 = this.facilityServiceId;
        String str4 = this.cdbase;
        String str5 = this.metiRef;
        BffProductOfferAssortment bffProductOfferAssortment = this.assortment;
        Integer num = this.purchasingStep;
        Integer num2 = this.purchasingMin;
        Integer num3 = this.purchasingMax;
        String str6 = this.origin;
        String str7 = this.labelHighlight;
        Integer num4 = this.weightingFactor;
        String str8 = this.freshnessGaranteed;
        Double d = this.score;
        BffAvailability bffAvailability = this.availability;
        BffPrices bffPrices = this.prices;
        BffBffDiscount bffBffDiscount = this.bffPromo;
        List<BffBffDiscount> list = this.bffDiscounts;
        BffOfferFlags bffOfferFlags = this.flags;
        String str9 = this.offerId;
        Boolean bool = this.isVariableWeight;
        Boolean bool2 = this.isAlternativeCheaper;
        String str10 = this.bffVariableWeightSafetyMargin;
        String str11 = this.shopId;
        String str12 = this.shopName;
        String str13 = this.productStateCode;
        String str14 = this.offerRank;
        BffShipping bffShipping = this.shipping;
        Boolean bool3 = this.isNew;
        Boolean bool4 = this.isEligible;
        Boolean bool5 = this.isDigitalCard;
        Boolean bool6 = this.isPremium;
        Boolean bool7 = this.isIndispensable;
        Boolean bool8 = this.isInAssortment;
        Boolean bool9 = this.bffIsStopped;
        Boolean bool10 = this.bffIsIncontournable;
        Boolean bool11 = this.bffIsPurchasable;
        Integer num5 = this.promoTypeSort;
        String str15 = this.promotionHighlight;
        Boolean bool12 = this.isUnavoidable;
        Boolean bool13 = this.pictedInWarehouse;
        Boolean bool14 = this.isStockInfinite;
        Boolean bool15 = this.isPreorder;
        Boolean bool16 = this.isRelayPointEligible;
        Boolean bool17 = this.isExpressWithdrawalEligible;
        Boolean bool18 = this.isInnovation;
        BffDisplayLabel bffDisplayLabel2 = this.bffDisplayLabel;
        BffChannelType bffChannelType2 = this.bffChannelType;
        BffTraceability bffTraceability = this.traceability;
        return "BffProductOffer(gtin=" + str + ", facilityId=" + str2 + ", facilityServiceId=" + str3 + ", cdbase=" + str4 + ", metiRef=" + str5 + ", assortment=" + bffProductOfferAssortment + ", purchasingStep=" + num + ", purchasingMin=" + num2 + ", purchasingMax=" + num3 + ", origin=" + str6 + ", labelHighlight=" + str7 + ", weightingFactor=" + num4 + ", freshnessGaranteed=" + str8 + ", score=" + d + ", availability=" + bffAvailability + ", prices=" + bffPrices + ", bffPromo=" + bffBffDiscount + ", bffDiscounts=" + list + ", flags=" + bffOfferFlags + ", offerId=" + str9 + ", isVariableWeight=" + bool + ", isAlternativeCheaper=" + bool2 + ", bffVariableWeightSafetyMargin=" + str10 + ", shopId=" + str11 + ", shopName=" + str12 + ", productStateCode=" + str13 + ", offerRank=" + str14 + ", shipping=" + bffShipping + ", isNew=" + bool3 + ", isEligible=" + bool4 + ", isDigitalCard=" + bool5 + ", isPremium=" + bool6 + ", isIndispensable=" + bool7 + ", isInAssortment=" + bool8 + ", bffIsStopped=" + bool9 + ", bffIsIncontournable=" + bool10 + ", bffIsPurchasable=" + bool11 + ", promoTypeSort=" + num5 + ", promotionHighlight=" + str15 + ", isUnavoidable=" + bool12 + ", pictedInWarehouse=" + bool13 + ", isStockInfinite=" + bool14 + ", isPreorder=" + bool15 + ", isRelayPointEligible=" + bool16 + ", isExpressWithdrawalEligible=" + bool17 + ", isInnovation=" + bool18 + ", bffDisplayLabel=" + bffDisplayLabel2 + ", bffChannelType=" + bffChannelType2 + ", traceability=" + bffTraceability + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffProductOffer(int i, int i2, @C12438n("gtin") String str, @C12438n("facility_id") String str2, @C12438n("facility_service_id") String str3, @C12438n("cdbase") String str4, @C12438n("meti_ref") String str5, @C12438n("assortment") BffProductOfferAssortment bffProductOfferAssortment, @C12438n("purchasing_step") Integer num, @C12438n("purchasing_min") Integer num2, @C12438n("purchasing_max") Integer num3, @C12438n("origin") String str6, @C12438n("label_highlight") String str7, @C12438n("weighting_factor") Integer num4, @C12438n("freshness_garanteed") String str8, @C12438n("score") Double d, @C12438n("availability") BffAvailability bffAvailability, @C12438n("prices") BffPrices bffPrices, @C12438n("bff_promo") BffBffDiscount bffBffDiscount, @C12438n("bff_discounts") List list, @C12438n("flags") BffOfferFlags bffOfferFlags, @C12438n("offer_id") String str9, @C12438n("is_variable_weight") Boolean bool, @C12438n("is_alternative_cheaper") Boolean bool2, @C12438n("bff_variable_weight_safety_margin") String str10, @C12438n("shop_id") String str11, @C12438n("shop_name") String str12, @C12438n("product_state_code") String str13, @C12438n("offer_rank") String str14, @C12438n("shipping") BffShipping bffShipping, @C12438n("is_new") Boolean bool3, @C12438n("is_eligible") Boolean bool4, @C12438n("is_digital_card") Boolean bool5, @C12438n("is_premium") Boolean bool6, @C12438n("is_indispensable") Boolean bool7, @C12438n("is_in_assortment") Boolean bool8, @C12438n("bff_is_stopped") Boolean bool9, @C12438n("bff_is_incontournable") Boolean bool10, @C12438n("bff_is_purchasable") Boolean bool11, @C12438n("promo_type_sort") Integer num5, @C12438n("promotion_highlight") String str15, @C12438n("is_unavoidable") Boolean bool12, @C12438n("picted_in_warehouse") Boolean bool13, @C12438n("is_stock_infinite") Boolean bool14, @C12438n("is_preorder") Boolean bool15, @C12438n("is_relay_point_eligible") Boolean bool16, @C12438n("is_express_withdrawal_eligible") Boolean bool17, @C12438n("is_innovation") Boolean bool18, @C12438n("bff_display_label") BffDisplayLabel bffDisplayLabel2, @C12438n("bff_channel_type") BffChannelType bffChannelType2, @C12438n("traceability") BffTraceability bffTraceability, C12295n1 n1Var) {
        int i3 = i;
        int i4 = i2;
        if (((i3 & 0) != 0) || ((i4 & 0) != 0)) {
            C12261c1.m49255a(new int[]{i3, i4}, new int[]{0, 0}, BffProductOffer$$serializer.INSTANCE.getDescriptor());
        }
        if ((i3 & 1) == 0) {
            this.gtin = null;
        } else {
            this.gtin = str;
        }
        if ((i3 & 2) == 0) {
            this.facilityId = null;
        } else {
            this.facilityId = str2;
        }
        if ((i3 & 4) == 0) {
            this.facilityServiceId = null;
        } else {
            this.facilityServiceId = str3;
        }
        if ((i3 & 8) == 0) {
            this.cdbase = null;
        } else {
            this.cdbase = str4;
        }
        if ((i3 & 16) == 0) {
            this.metiRef = null;
        } else {
            this.metiRef = str5;
        }
        if ((i3 & 32) == 0) {
            this.assortment = null;
        } else {
            this.assortment = bffProductOfferAssortment;
        }
        if ((i3 & 64) == 0) {
            this.purchasingStep = null;
        } else {
            this.purchasingStep = num;
        }
        if ((i3 & 128) == 0) {
            this.purchasingMin = null;
        } else {
            this.purchasingMin = num2;
        }
        if ((i3 & 256) == 0) {
            this.purchasingMax = null;
        } else {
            this.purchasingMax = num3;
        }
        if ((i3 & 512) == 0) {
            this.origin = null;
        } else {
            this.origin = str6;
        }
        if ((i3 & 1024) == 0) {
            this.labelHighlight = null;
        } else {
            this.labelHighlight = str7;
        }
        if ((i3 & 2048) == 0) {
            this.weightingFactor = null;
        } else {
            this.weightingFactor = num4;
        }
        if ((i3 & 4096) == 0) {
            this.freshnessGaranteed = null;
        } else {
            this.freshnessGaranteed = str8;
        }
        if ((i3 & 8192) == 0) {
            this.score = null;
        } else {
            this.score = d;
        }
        if ((i3 & 16384) == 0) {
            this.availability = null;
        } else {
            this.availability = bffAvailability;
        }
        if ((i3 & 32768) == 0) {
            this.prices = null;
        } else {
            this.prices = bffPrices;
        }
        if ((i3 & 65536) == 0) {
            this.bffPromo = null;
        } else {
            this.bffPromo = bffBffDiscount;
        }
        if ((131072 & i3) == 0) {
            this.bffDiscounts = null;
        } else {
            this.bffDiscounts = list;
        }
        if ((262144 & i3) == 0) {
            this.flags = null;
        } else {
            this.flags = bffOfferFlags;
        }
        if ((524288 & i3) == 0) {
            this.offerId = null;
        } else {
            this.offerId = str9;
        }
        if ((1048576 & i3) == 0) {
            this.isVariableWeight = null;
        } else {
            this.isVariableWeight = bool;
        }
        if ((2097152 & i3) == 0) {
            this.isAlternativeCheaper = null;
        } else {
            this.isAlternativeCheaper = bool2;
        }
        if ((4194304 & i3) == 0) {
            this.bffVariableWeightSafetyMargin = null;
        } else {
            this.bffVariableWeightSafetyMargin = str10;
        }
        if ((8388608 & i3) == 0) {
            this.shopId = null;
        } else {
            this.shopId = str11;
        }
        if ((16777216 & i3) == 0) {
            this.shopName = null;
        } else {
            this.shopName = str12;
        }
        if ((33554432 & i3) == 0) {
            this.productStateCode = null;
        } else {
            this.productStateCode = str13;
        }
        if ((67108864 & i3) == 0) {
            this.offerRank = null;
        } else {
            this.offerRank = str14;
        }
        if ((134217728 & i3) == 0) {
            this.shipping = null;
        } else {
            this.shipping = bffShipping;
        }
        if ((268435456 & i3) == 0) {
            this.isNew = null;
        } else {
            this.isNew = bool3;
        }
        if ((536870912 & i3) == 0) {
            this.isEligible = null;
        } else {
            this.isEligible = bool4;
        }
        if ((1073741824 & i3) == 0) {
            this.isDigitalCard = null;
        } else {
            this.isDigitalCard = bool5;
        }
        if ((i3 & Integer.MIN_VALUE) == 0) {
            this.isPremium = null;
        } else {
            this.isPremium = bool6;
        }
        if ((i4 & 1) == 0) {
            this.isIndispensable = null;
        } else {
            this.isIndispensable = bool7;
        }
        if ((i4 & 2) == 0) {
            this.isInAssortment = null;
        } else {
            this.isInAssortment = bool8;
        }
        if ((i4 & 4) == 0) {
            this.bffIsStopped = null;
        } else {
            this.bffIsStopped = bool9;
        }
        if ((i4 & 8) == 0) {
            this.bffIsIncontournable = null;
        } else {
            this.bffIsIncontournable = bool10;
        }
        if ((i4 & 16) == 0) {
            this.bffIsPurchasable = null;
        } else {
            this.bffIsPurchasable = bool11;
        }
        if ((i4 & 32) == 0) {
            this.promoTypeSort = null;
        } else {
            this.promoTypeSort = num5;
        }
        if ((i4 & 64) == 0) {
            this.promotionHighlight = null;
        } else {
            this.promotionHighlight = str15;
        }
        if ((i4 & 128) == 0) {
            this.isUnavoidable = null;
        } else {
            this.isUnavoidable = bool12;
        }
        if ((i4 & 256) == 0) {
            this.pictedInWarehouse = null;
        } else {
            this.pictedInWarehouse = bool13;
        }
        if ((i4 & 512) == 0) {
            this.isStockInfinite = null;
        } else {
            this.isStockInfinite = bool14;
        }
        if ((i4 & 1024) == 0) {
            this.isPreorder = null;
        } else {
            this.isPreorder = bool15;
        }
        if ((i4 & 2048) == 0) {
            this.isRelayPointEligible = null;
        } else {
            this.isRelayPointEligible = bool16;
        }
        if ((i4 & 4096) == 0) {
            this.isExpressWithdrawalEligible = null;
        } else {
            this.isExpressWithdrawalEligible = bool17;
        }
        if ((i4 & 8192) == 0) {
            this.isInnovation = null;
        } else {
            this.isInnovation = bool18;
        }
        if ((i4 & 16384) == 0) {
            this.bffDisplayLabel = null;
        } else {
            this.bffDisplayLabel = bffDisplayLabel2;
        }
        if ((i4 & 32768) == 0) {
            this.bffChannelType = null;
        } else {
            this.bffChannelType = bffChannelType2;
        }
        if ((i4 & 65536) == 0) {
            this.traceability = null;
        } else {
            this.traceability = bffTraceability;
        }
    }

    public BffProductOffer(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l BffProductOfferAssortment bffProductOfferAssortment, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l String str6, @C12580l String str7, @C12580l Integer num4, @C12580l String str8, @C12580l Double d, @C12580l BffAvailability bffAvailability, @C12580l BffPrices bffPrices, @C12580l BffBffDiscount bffBffDiscount, @C12580l List<BffBffDiscount> list, @C12580l BffOfferFlags bffOfferFlags, @C12580l String str9, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l BffShipping bffShipping, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12580l Boolean bool5, @C12580l Boolean bool6, @C12580l Boolean bool7, @C12580l Boolean bool8, @C12580l Boolean bool9, @C12580l Boolean bool10, @C12580l Boolean bool11, @C12580l Integer num5, @C12580l String str15, @C12580l Boolean bool12, @C12580l Boolean bool13, @C12580l Boolean bool14, @C12580l Boolean bool15, @C12580l Boolean bool16, @C12580l Boolean bool17, @C12580l Boolean bool18, @C12580l BffDisplayLabel bffDisplayLabel2, @C12580l BffChannelType bffChannelType2, @C12580l BffTraceability bffTraceability) {
        this.gtin = str;
        this.facilityId = str2;
        this.facilityServiceId = str3;
        this.cdbase = str4;
        this.metiRef = str5;
        this.assortment = bffProductOfferAssortment;
        this.purchasingStep = num;
        this.purchasingMin = num2;
        this.purchasingMax = num3;
        this.origin = str6;
        this.labelHighlight = str7;
        this.weightingFactor = num4;
        this.freshnessGaranteed = str8;
        this.score = d;
        this.availability = bffAvailability;
        this.prices = bffPrices;
        this.bffPromo = bffBffDiscount;
        this.bffDiscounts = list;
        this.flags = bffOfferFlags;
        this.offerId = str9;
        this.isVariableWeight = bool;
        this.isAlternativeCheaper = bool2;
        this.bffVariableWeightSafetyMargin = str10;
        this.shopId = str11;
        this.shopName = str12;
        this.productStateCode = str13;
        this.offerRank = str14;
        this.shipping = bffShipping;
        this.isNew = bool3;
        this.isEligible = bool4;
        this.isDigitalCard = bool5;
        this.isPremium = bool6;
        this.isIndispensable = bool7;
        this.isInAssortment = bool8;
        this.bffIsStopped = bool9;
        this.bffIsIncontournable = bool10;
        this.bffIsPurchasable = bool11;
        this.promoTypeSort = num5;
        this.promotionHighlight = str15;
        this.isUnavoidable = bool12;
        this.pictedInWarehouse = bool13;
        this.isStockInfinite = bool14;
        this.isPreorder = bool15;
        this.isRelayPointEligible = bool16;
        this.isExpressWithdrawalEligible = bool17;
        this.isInnovation = bool18;
        this.bffDisplayLabel = bffDisplayLabel2;
        this.bffChannelType = bffChannelType2;
        this.traceability = bffTraceability;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffProductOffer(java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOfferAssortment r55, java.lang.Integer r56, java.lang.Integer r57, java.lang.Integer r58, java.lang.String r59, java.lang.String r60, java.lang.Integer r61, java.lang.String r62, java.lang.Double r63, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability r64, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices r65, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount r66, java.util.List r67, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags r68, java.lang.String r69, java.lang.Boolean r70, java.lang.Boolean r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping r77, java.lang.Boolean r78, java.lang.Boolean r79, java.lang.Boolean r80, java.lang.Boolean r81, java.lang.Boolean r82, java.lang.Boolean r83, java.lang.Boolean r84, java.lang.Boolean r85, java.lang.Boolean r86, java.lang.Integer r87, java.lang.String r88, java.lang.Boolean r89, java.lang.Boolean r90, java.lang.Boolean r91, java.lang.Boolean r92, java.lang.Boolean r93, java.lang.Boolean r94, java.lang.Boolean r95, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffDisplayLabel r96, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType r97, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability r98, int r99, int r100, kotlin.jvm.internal.DefaultConstructorMarker r101) {
        /*
            r49 = this;
            r0 = r99
            r1 = r100
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = r50
        L_0x000c:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r51
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 0
            goto L_0x001c
        L_0x001a:
            r5 = r52
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = 0
            goto L_0x0024
        L_0x0022:
            r6 = r53
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r54
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r55
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r56
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r57
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r58
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = 0
            goto L_0x0054
        L_0x0052:
            r12 = r59
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = 0
            goto L_0x005c
        L_0x005a:
            r13 = r60
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = 0
            goto L_0x0064
        L_0x0062:
            r14 = r61
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = 0
            goto L_0x006c
        L_0x006a:
            r15 = r62
        L_0x006c:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0072
            r3 = 0
            goto L_0x0074
        L_0x0072:
            r3 = r63
        L_0x0074:
            r16 = r3
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x007c
            r3 = 0
            goto L_0x007e
        L_0x007c:
            r3 = r64
        L_0x007e:
            r17 = 32768(0x8000, float:4.5918E-41)
            r18 = r0 & r17
            if (r18 == 0) goto L_0x0088
            r18 = 0
            goto L_0x008a
        L_0x0088:
            r18 = r65
        L_0x008a:
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r19
            if (r20 == 0) goto L_0x0093
            r20 = 0
            goto L_0x0095
        L_0x0093:
            r20 = r66
        L_0x0095:
            r21 = 131072(0x20000, float:1.83671E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x009e
            r21 = 0
            goto L_0x00a0
        L_0x009e:
            r21 = r67
        L_0x00a0:
            r22 = 262144(0x40000, float:3.67342E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00a9
            r22 = 0
            goto L_0x00ab
        L_0x00a9:
            r22 = r68
        L_0x00ab:
            r23 = 524288(0x80000, float:7.34684E-40)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00b4
            r23 = 0
            goto L_0x00b6
        L_0x00b4:
            r23 = r69
        L_0x00b6:
            r24 = 1048576(0x100000, float:1.469368E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00bf
            r24 = 0
            goto L_0x00c1
        L_0x00bf:
            r24 = r70
        L_0x00c1:
            r25 = 2097152(0x200000, float:2.938736E-39)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00ca
            r25 = 0
            goto L_0x00cc
        L_0x00ca:
            r25 = r71
        L_0x00cc:
            r26 = 4194304(0x400000, float:5.877472E-39)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00d5
            r26 = 0
            goto L_0x00d7
        L_0x00d5:
            r26 = r72
        L_0x00d7:
            r27 = 8388608(0x800000, float:1.17549435E-38)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00e0
            r27 = 0
            goto L_0x00e2
        L_0x00e0:
            r27 = r73
        L_0x00e2:
            r28 = 16777216(0x1000000, float:2.3509887E-38)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00eb
            r28 = 0
            goto L_0x00ed
        L_0x00eb:
            r28 = r74
        L_0x00ed:
            r29 = 33554432(0x2000000, float:9.403955E-38)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x00f6
            r29 = 0
            goto L_0x00f8
        L_0x00f6:
            r29 = r75
        L_0x00f8:
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x0101
            r30 = 0
            goto L_0x0103
        L_0x0101:
            r30 = r76
        L_0x0103:
            r31 = 134217728(0x8000000, float:3.85186E-34)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x010c
            r31 = 0
            goto L_0x010e
        L_0x010c:
            r31 = r77
        L_0x010e:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x0117
            r32 = 0
            goto L_0x0119
        L_0x0117:
            r32 = r78
        L_0x0119:
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x0122
            r33 = 0
            goto L_0x0124
        L_0x0122:
            r33 = r79
        L_0x0124:
            r34 = 1073741824(0x40000000, float:2.0)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x012d
            r34 = 0
            goto L_0x012f
        L_0x012d:
            r34 = r80
        L_0x012f:
            r35 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r35
            if (r0 == 0) goto L_0x0137
            r0 = 0
            goto L_0x0139
        L_0x0137:
            r0 = r81
        L_0x0139:
            r35 = r1 & 1
            if (r35 == 0) goto L_0x0140
            r35 = 0
            goto L_0x0142
        L_0x0140:
            r35 = r82
        L_0x0142:
            r36 = r1 & 2
            if (r36 == 0) goto L_0x0149
            r36 = 0
            goto L_0x014b
        L_0x0149:
            r36 = r83
        L_0x014b:
            r37 = r1 & 4
            if (r37 == 0) goto L_0x0152
            r37 = 0
            goto L_0x0154
        L_0x0152:
            r37 = r84
        L_0x0154:
            r38 = r1 & 8
            if (r38 == 0) goto L_0x015b
            r38 = 0
            goto L_0x015d
        L_0x015b:
            r38 = r85
        L_0x015d:
            r39 = r1 & 16
            if (r39 == 0) goto L_0x0164
            r39 = 0
            goto L_0x0166
        L_0x0164:
            r39 = r86
        L_0x0166:
            r40 = r1 & 32
            if (r40 == 0) goto L_0x016d
            r40 = 0
            goto L_0x016f
        L_0x016d:
            r40 = r87
        L_0x016f:
            r41 = r1 & 64
            if (r41 == 0) goto L_0x0176
            r41 = 0
            goto L_0x0178
        L_0x0176:
            r41 = r88
        L_0x0178:
            r99 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0180
            r0 = 0
            goto L_0x0182
        L_0x0180:
            r0 = r89
        L_0x0182:
            r42 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x018a
            r0 = 0
            goto L_0x018c
        L_0x018a:
            r0 = r90
        L_0x018c:
            r43 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0194
            r0 = 0
            goto L_0x0196
        L_0x0194:
            r0 = r91
        L_0x0196:
            r44 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x019e
            r0 = 0
            goto L_0x01a0
        L_0x019e:
            r0 = r92
        L_0x01a0:
            r45 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01a8
            r0 = 0
            goto L_0x01aa
        L_0x01a8:
            r0 = r93
        L_0x01aa:
            r46 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01b2
            r0 = 0
            goto L_0x01b4
        L_0x01b2:
            r0 = r94
        L_0x01b4:
            r47 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01bc
            r0 = 0
            goto L_0x01be
        L_0x01bc:
            r0 = r95
        L_0x01be:
            r48 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01c6
            r0 = 0
            goto L_0x01c8
        L_0x01c6:
            r0 = r96
        L_0x01c8:
            r17 = r1 & r17
            if (r17 == 0) goto L_0x01cf
            r17 = 0
            goto L_0x01d1
        L_0x01cf:
            r17 = r97
        L_0x01d1:
            r1 = r1 & r19
            if (r1 == 0) goto L_0x01d7
            r1 = 0
            goto L_0x01d9
        L_0x01d7:
            r1 = r98
        L_0x01d9:
            r50 = r49
            r51 = r2
            r52 = r4
            r53 = r5
            r54 = r6
            r55 = r7
            r56 = r8
            r57 = r9
            r58 = r10
            r59 = r11
            r60 = r12
            r61 = r13
            r62 = r14
            r63 = r15
            r64 = r16
            r65 = r3
            r66 = r18
            r67 = r20
            r68 = r21
            r69 = r22
            r70 = r23
            r71 = r24
            r72 = r25
            r73 = r26
            r74 = r27
            r75 = r28
            r76 = r29
            r77 = r30
            r78 = r31
            r79 = r32
            r80 = r33
            r81 = r34
            r82 = r99
            r83 = r35
            r84 = r36
            r85 = r37
            r86 = r38
            r87 = r39
            r88 = r40
            r89 = r41
            r90 = r42
            r91 = r43
            r92 = r44
            r93 = r45
            r94 = r46
            r95 = r47
            r96 = r48
            r97 = r0
            r98 = r17
            r99 = r1
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOfferAssortment, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Double, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount, java.util.List, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffDisplayLabel, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
