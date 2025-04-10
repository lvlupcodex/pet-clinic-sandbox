package org.springframework.boot.actuate.autoconfigure.management;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.management.HeapDumpWebEndpoint;

/**
 * Bean definitions for {@link HeapDumpWebEndpointAutoConfiguration}.
 */
@Generated
public class HeapDumpWebEndpointAutoConfiguration__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'heapDumpWebEndpointAutoConfiguration'.
   */
  public static BeanDefinition getHeapDumpWebEndpointAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HeapDumpWebEndpointAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(HeapDumpWebEndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'heapDumpWebEndpoint'.
   */
  private static BeanInstanceSupplier<HeapDumpWebEndpoint> getHeapDumpWebEndpointInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HeapDumpWebEndpoint>forFactoryMethod(HeapDumpWebEndpointAutoConfiguration.class, "heapDumpWebEndpoint")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.management.HeapDumpWebEndpointAutoConfiguration", HeapDumpWebEndpointAutoConfiguration.class).heapDumpWebEndpoint());
  }

  /**
   * Get the bean definition for 'heapDumpWebEndpoint'.
   */
  public static BeanDefinition getHeapDumpWebEndpointBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HeapDumpWebEndpoint.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.management.HeapDumpWebEndpointAutoConfiguration");
    beanDefinition.setInstanceSupplier(getHeapDumpWebEndpointInstanceSupplier());
    return beanDefinition;
  }
}
