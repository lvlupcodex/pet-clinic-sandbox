package org.springframework.boot.actuate.autoconfigure.endpoint;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.endpoint.invoke.ParameterValueMapper;
import org.springframework.boot.actuate.endpoint.invoker.cache.CachingOperationInvokerAdvisor;
import org.springframework.core.env.Environment;

/**
 * Bean definitions for {@link EndpointAutoConfiguration}.
 */
@Generated
public class EndpointAutoConfiguration__TestContext004_BeanDefinitions {
  /**
   * Get the bean definition for 'endpointAutoConfiguration'.
   */
  public static BeanDefinition getEndpointAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EndpointAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(EndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'endpointOperationParameterMapper'.
   */
  private static BeanInstanceSupplier<ParameterValueMapper> getEndpointOperationParameterMapperInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ParameterValueMapper>forFactoryMethod(EndpointAutoConfiguration.class, "endpointOperationParameterMapper", ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration", EndpointAutoConfiguration.class).endpointOperationParameterMapper(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'endpointOperationParameterMapper'.
   */
  public static BeanDefinition getEndpointOperationParameterMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ParameterValueMapper.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration");
    beanDefinition.setInstanceSupplier(getEndpointOperationParameterMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'endpointCachingOperationInvokerAdvisor'.
   */
  private static BeanInstanceSupplier<CachingOperationInvokerAdvisor> getEndpointCachingOperationInvokerAdvisorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CachingOperationInvokerAdvisor>forFactoryMethod(EndpointAutoConfiguration.class, "endpointCachingOperationInvokerAdvisor", Environment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration", EndpointAutoConfiguration.class).endpointCachingOperationInvokerAdvisor(args.get(0)));
  }

  /**
   * Get the bean definition for 'endpointCachingOperationInvokerAdvisor'.
   */
  public static BeanDefinition getEndpointCachingOperationInvokerAdvisorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CachingOperationInvokerAdvisor.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration");
    beanDefinition.setInstanceSupplier(getEndpointCachingOperationInvokerAdvisorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'propertiesEndpointAccessResolver'.
   */
  private static BeanInstanceSupplier<PropertiesEndpointAccessResolver> getPropertiesEndpointAccessResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PropertiesEndpointAccessResolver>forFactoryMethod(EndpointAutoConfiguration.class, "propertiesEndpointAccessResolver", Environment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration", EndpointAutoConfiguration.class).propertiesEndpointAccessResolver(args.get(0)));
  }

  /**
   * Get the bean definition for 'propertiesEndpointAccessResolver'.
   */
  public static BeanDefinition getPropertiesEndpointAccessResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PropertiesEndpointAccessResolver.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration");
    beanDefinition.setInstanceSupplier(getPropertiesEndpointAccessResolverInstanceSupplier());
    return beanDefinition;
  }
}
