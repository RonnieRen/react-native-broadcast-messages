
#import "RNMessages.h"

@implementation RNMessages

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()


- (NSArray<NSString *> *)supportedEvents
{
    return @[@"OnMessage"];
}

RCT_EXPORT_METHOD(postMessage:(NSString*)name data: (id) data) {
    if(name && [[self supportedEvents] containsObject:name]) {
        [self sendEventWithName: name body: data];
    }
}

@end
