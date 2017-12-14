
Pod::Spec.new do |s|
  s.name         = "react-native-messages"
  s.version      = "0.0.1"
  s.summary      = "react-native-messages"
  s.description  = <<-DESC
                  simple native module to send a event to native and then native broadcast it to all its subscribers.
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "ronnieren" => "ronnie.ren@outlook.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/ronnieren/react-native-messages.git", :tag => "master" }
  s.source_files  = "RNMessages/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

