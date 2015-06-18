package sk.dfx.labs.mdsal.fluent.binding.api;

import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Identifiable;

public interface WhatBuilder<T extends DataObject> extends FirstConditionBuilder<T> {

    <C extends Identifiable<?> & ChildOf<? super T>> WhatBuilder<C> any(final Class<C> child);



}
