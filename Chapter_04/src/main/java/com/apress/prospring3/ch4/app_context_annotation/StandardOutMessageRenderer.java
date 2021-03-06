/**
 * Created on Sep 11, 2011
 */
package com.apress.prospring3.ch4.app_context_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Clarence
 */
@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {

  private MessageProvider messageProvider = null;

  public void render() {
    System.out.println("Метод: " + this.getClass().getName() + ".render");
    if (messageProvider == null) {
      throw new RuntimeException(
        "You must set the property messageProvider of class:"
          + StandardOutMessageRenderer.class.getName());
    }
    System.out.println(messageProvider.getMessage());
  }

  // @Autowired // Автосвязывае отключенно, возникалет конфликт при использовании автосвязывания по типу.
  @Resource(name="messageProvider")
  public void setMessageProvider(MessageProvider provider) {
    this.messageProvider = provider;
  }

  public MessageProvider getMessageProvider() {
    return this.messageProvider;
  }

}
