package com.example.eventapp.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

// 이벤트 발송 class
@Component
public class FileEventPublisher {
    // ApplicationEventPublisher : 이벤트 전달 가능
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    // 주문이 완료 되었을 때
    public void notifyComplete(FileEvent fileEvent){
        // publishEvent object 를 받을 수 있기 때문에 값을 넣을 수 있다.
        applicationEventPublisher.publishEvent(fileEvent);
    }
    // 실패 했을 때
    public void notifyError(FileEvent fileEvent ){
        applicationEventPublisher.publishEvent(fileEvent);
    }

}
