
#import "RNEvents.h"

@implementation RNEvents

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()


- (NSArray<NSString *> *)supportedEvents
{
    return @[@"OnMessage"];
}

RCT_EXPORT_METHOD(postEvent:(NSString*)name data: (id) data) {
    if(name && [[self supportedEvents] containsObject:name]) {
        [self sendEventWithName: name body: data];
    }
}

@end
