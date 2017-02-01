param($wsdl_dir, $bindings_dir);

$NAMES = @(
);


function Find-InArray()
{
  param($array, $s);
  $found = $False;
  foreach($i in $array)
  {
    $t = $i.Split(",");
    if ( $s -eq $t[0] )
    {
      $found = $True;
    }
  }
  $found;
}

function Get-BadName()
{
  param($s);
  
  $ca = $s.ToCharArray();
  [string]$c0 = $ca[0];
  $ca[0] = $c0.ToUpper();
  
  [string]::Join("", $ca);
}

# Build up name list
foreach($file in (Get-ChildItem $wsdl_dir))
{
  $fn = $file.Fullname;
  $bn = $file.Basename;
  
  $tokens = $bn.Split(".");
  foreach($t in $tokens)
  {
    if ( [char]::IsLower($t[0]) )
    {
#      Write-Host "$bn ($t)";
      
      if ( -not (Find-InArray $NAMES $t) )
      {
        $bad_name = Get-BadName $t;
        $NAMES += @("${t},${bad_name}");
      }
    }
  }
}

$NAMES;

# Process Bindings

foreach($file in (Get-ChildItem -File $bindings_dir))
{
  $fn = $file.FullName;
  $bn = $file.BaseName;
  
  # Filename changes
  foreach($name in $NAMES)
  {
    $nt = $name.Split(",");
    $good_name = $nt[0];
    $bad_name = $nt[1];
    
    if ( $bn.Contains($bad_name) )
    {
      # Found a file match
      Write-Host "BAD FILE NAME $bn ($good_name, $bad_name)";
      
      $newname = $fn.Replace($bad_name, $good_name);
      
      #Write-Host "NEWNAME: $newname";
      Write-Host "RENAMING file $bn...";
      Rename-Item $fn $newname;
    }
  }
}

#exit;
#Content Changes

foreach($file in (Get-ChildItem -File $bindings_dir))
{
  $FoundMatch = $False;
  
  $fn = $file.FullName;
  $bn = $file.BaseName;
  
  $lines = Get-Content $fn;
  
  for($i=0; $i -lt $lines.Length; $i++)
  {
    foreach($name in $names)
    {
      $nt = $name.Split(",");
      $good_name = $nt[0];
      $bad_name = $nt[1];
      
      #Look in line
      if ( $lines[$i].Contains($bad_name) )
      {
        #Write-Host $lines[$i];
        $lines[$i] = $lines[$i].Replace($bad_name, $good_name);
        #Write-Host $lines[$i];
        $FoundMatch = $True;
      }
    }
  }
  
  if ( $FoundMatch )
  {
    Write-Host "Updating file $fn...";
    Set-Content -Path $fn -Value $lines;
    #exit;
  }
  
}

