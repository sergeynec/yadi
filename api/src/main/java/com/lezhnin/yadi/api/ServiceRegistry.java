package com.lezhnin.yadi.api;

public interface ServiceRegistry extends ServiceLocator {

    ServiceRegistry register(ServiceSupplier<?> serviceSupplier);
}
