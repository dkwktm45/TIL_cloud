package com.example.eventapp.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FileEventListener {
    // EventListener annotation 를 추가 해준다면 수신을 받을 수 있다.
    @EventListener
    public void onFileEnventHandler(FileEvent fileEvent){
        log.info("fileevent result : " + fileEvent.getType() + " and " + fileEvent.getData());
    }

}
